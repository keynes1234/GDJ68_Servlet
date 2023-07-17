package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.main.util.DBConnector;

public class BankBookDAO {
	
	//상품 N개 조회
	public void bankBookList()throws Exception{
		
		
		//1. DB연결
		Connection con = DBConnector.getConnection();
		
		//2.query문
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		
		//3. 미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ?세팅
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
		}
	}
	
	//상품 1개 조회
	public BankBookDTO bankBookDetail(BankBookDTO bankBookDTO) throws Exception {
		//1. DB연결
		Connection con = DBConnector.getConnection();
		
		//2. query
		String sql ="SELECT * FROM BANKBOOK WHERE BOOKNUM=?";
		
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.세팅
		st.setLong(1,bankBookDTO.getBookNum());
		
		//5. 최종 및 결과 처리
		ResultSet rs = st.executeQuery();
		// cursor 한줄 읽기 rs.next()
		//그 결과물을 rs에 담음
		
		if(rs.next()) {
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
		}else {
			bankBookDTO = null;
		}
		
		return bankBookDTO;
	}
	
	//insert
	//bankBookAdd
	public int bankBookAdd(BankBookDTO bankBookDTO) throws Exception {
		//1. DB작성
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql="INSERT INTO BANKBOOK VALUES (BANK_SEQ.NEXTVAL, ?,?, ?)";
		
		//3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2,bankBookDTO.getBookRate());
		st.setInt(3, bankBookDTO.getBookSale());
		
		//4.최종전송 및 결과 처리
		int result = st.executeUpdate();
		System.out.println("DB에 Insert");
		return result;
	}
	
	public int bankBookDelete(BankBookDTO bankBookDTO) throws Exception {
		//1. DB연동
		Connection con = DBConnector.getConnection();
		//2. query문 작성
		String sql="DELETE BANKBOOK WHERE BOOKNUM=?";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?세팅
		st.setLong(1, bankBookDTO.getBookNum());
		//5. 최종전송 및 결과 처리
		int result = st.executeUpdate();
		
		
		System.out.println("Db Delete");
		return result;
	}
}

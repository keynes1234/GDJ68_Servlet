package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.main.util.DBConnector;

public class BankBookDAO {
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
	
	public void bankBookDelete() {
		System.out.println("Db Delete");
	}
}

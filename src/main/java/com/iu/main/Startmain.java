package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;
import com.iu.main.util.DBConnector;

public class Startmain {
	public static void main(String[] args) {
		System.out.println("StartMain");
		//실행, Test
		try {
				BankBookDAO bankBookDAO = new BankBookDAO();
				BankBookInput bankBookInput = new BankBookInput();
				
				BankBookDTO bankBookDTO = bankBookInput.bankBookAdd();
				
		
				
				//BankBookDTO bankBookDTO = new BankBookDTO();
				//bankBookDTO.setBookName("자유입출금");
				//bankBookDTO.setBookRate(5.9);
				//bankBookDTO.setBookSale(1);
				
				int result = bankBookDAO.bankBookAdd(bankBookDTO);
				if(result >= 1) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
								
				//DBConnector db = new DBConnector();
				//db.getConnection();
				
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}

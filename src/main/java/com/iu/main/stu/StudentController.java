package com.iu.main.stu;

import java.util.Scanner;



public class StudentController {
		private Scanner sc;
		private StudentInput studentInput;
		private StudentOutput studentOutput;
		private StudentDAO studentDAO;
		
	public StudentController() {
		sc = new Scanner(System.in);
		studentInput = new StudentInput();
		studentOutput = new StudentOutput();
		studentDAO = new StudentDAO();
	}
	
	public void start() throws Exception {
		
		//1. 제품 등록
				//2. 제품 삭제
				//3. 제품 조회
				//4. 프로그램 종료

		
	}

}

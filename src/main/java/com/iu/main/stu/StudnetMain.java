package com.iu.main.stu;

public class StudnetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StartStudent");
		
		try {
			StudentController studentController = new StudentController();
			studentController.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

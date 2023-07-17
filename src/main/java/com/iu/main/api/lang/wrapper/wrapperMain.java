package com.iu.main.api.lang.wrapper;

import com.iu.main.stu.StudentController;

public class wrapperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.BYTES);
//		
//		int num=10;
//		Integer num2 = new Integer(num);
//		num = num2.intValue();
//		
//		num2 = new Integer("32");
//		num = num2.intValue();
//		
//		//AutoBoxing
//		num2 = num;//
//		//AutoUnBoxing
//		num = num2;
//		
//		long l1 = 10L;
//		l1 = (long)num;
//		long l2 = num;
//		
//		String n = "20";
//		num = Integer.valueOf(n);// 문자를 숫자로
//		Integer.parseInt(n);
//		System.out.println(num*3);
		
		try {
			WrapperStudy wrapperStudy = new WrapperStudy();
			wrapperStudy.ex2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

}

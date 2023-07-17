package com.iu.main.api.lang.wrapper;


import java.util.Scanner;

import com.iu.main.bankBook.BankBookDTO;

public class WrapperStudy {
	
	public void s1() {
		String str="청약저축-5.2-1";
		String [] datas = str.split("-");
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName(datas[0]);
		bankBookDTO.setBookRate(Double.parseDouble(datas[1]));
		bankBookDTO.setBookSale(Integer.parseInt(datas[2]));
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		//1. 남녀 구분
		
		String jumin = "020523-3234567";
		String s =jumin.substring(7,8);
//		if(jumin.equals("1")||jumin.equals("3")) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		int num=Integer.parseInt(String.valueOf(s));
		if(num%2==0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		
		//2. 나이
		String year = jumin.substring(0,2);
		int myBirth=0;
		if(num==1 ||num==2) {
			myBirth=1900+ Integer.parseInt(year);
		}else {
			myBirth=2000+ Integer.parseInt(year);
		}
		System.out.println("Age : "+(2023-myBirth));
		
		
		//3. 3-4 : 봄, 6-8 : 여름, 9-11 : 가을, 12-2:겨울
		String month = jumin.substring(2,4);
		int m = Integer.parseInt(month);
		if(m>=3&&m<=5) {
			System.out.println("봄");
		}else if(m>=6&&m<=8) {
			System.out.println("여름");
		}else if(m>=9&&m<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin = sc.next();
		jumin = jumin.replace("-", "");
		int sum = 0;
		int numb =2;
		String s = null;
		System.out.println(jumin);
		
		for(int i=0; i<jumin.length();i++) {
			if(i==12) {
				s=jumin.substring(i);
				if(!"-".equals(s)) {
					System.out.println(s);
					
				}
			}else {
				s =jumin.substring(i,i+1);
				if(!"-".equals(s)) {
					System.out.println(s);
					if( numb>9) {
						numb=2;
					}
					int num = Integer.parseInt(s)*numb;
					numb++;
					sum = sum+num;
					
				}else {
					continue;
				}
			}
			
			System.out.println("sum : "+sum);
			
		}
		sum=sum%11;
		sum=11-sum;
		if(sum>9) {
			sum=sum%10;
		}
		
		
		int check=Integer.parseInt(String.valueOf(jumin.substring(12)));
				if(sum==check) {
					System.out.println("인증성공");
				}
				else {
					System.out.println("실패");
				}
		//System.out.println(sum);
	}
}

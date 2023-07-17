package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringStudy {
	
	private Scanner sc;
	
public void s1() {
	//문자열
	//length()
	//indexOf()
		
	String str = "Hello World";
	for(int i=0; i<str.length();i++) {
		System.out.println(str.charAt(i));
	}
	
	int ch=str.indexOf(96);
	System.out.println("CH :"+ch);
	ch = str.indexOf("H",4);
	
	str="iu.winter.suji.jpg";
	str.indexOf(".");
	str.lastIndexOf(".");
}
	

public void s2() {//파싱, 전처리
	//split
	//replace
	String data="서울,비,대구,눈,광주,맑음,부산,우박,제주,안개";
	
//	data = data.replace(" ", ",");
//	data = data.replace("-",",");
	
	String [] datas = data.split(",");
	for(int i=0;i<datas.length;i++) {
		System.out.println(datas[i]);
	}
	
}
public void s3() {
	String str="iu.suji.winter.jpg";
	str = str.substring(str.lastIndexOf(".")+1);
	
	System.out.println(str);
	
	str=String.valueOf(2);
	
}

public void ex1() {
	//파일명.확장자 abc.gif
	//확장자가 jpg면 이미지 파일입니다 출력
	//확장자가 .doc면 문서파일 출력
	//확장자가 .mp3면 오디오파일 출력
	//그외	알수없는 파일형식 출력
	System.out.println("파일명을 입력하세요");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	str  = str.substring(str.lastIndexOf(".")+1);
	if(str.equals("jpg")) {
		System.out.println("이미지 파일입니다.");
	}else if(str.equals("doc")) {
		System.out.println("문서 파일입니다.");
	}else if(str.equals("mp3")) {
		System.out.println("오디오 파일입니다.");
	}
	else {
		System.out.println("알수없는 파일형식입니다.");
	}
	
}

public void ex2() {
	//파일명.확장자 abc.gif
		//확장자가 jpg, jpeg,png,gif면 이미지 파일입니다 출력
		//확장자가 .doc,txt,hwp면 문서파일 출력
		//확장자가 .mp3, wav, midi, pcm 면 오디오파일 출력
		//그외	알수없는 파일형식 출력
	
	System.out.println("파일명을 입력하세요");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	str  = str.substring(str.lastIndexOf(".")+1);
	String img="jpg,jpeg,png,gif";
	String [] imgs = img.split(",");
	String mun="doc,txt,hwp";
	String [] muns = mun.split(",");
	String mus="mp3,wav,midi,pcm";
	String [] muss = mus.split(",");
	

	for(int i=0; i<imgs.length;i++) {
	if(str.equals(imgs[i])){
		System.out.println("이미지 파일입니다.");
		return;
	}
	}
	for(int j=0; j<muns.length;j++) {
	if(str.equals(muns[j])) {
		System.out.println("문서 파일입니다.");
		return;
	}
	
	}
	for(int k=0; k<muss.length;k++) {
	if(str.equals(muss[k])) {
		System.out.println("오디오 파일입니다.");
		return;
	}
	
	}
	
	 {
		System.out.println("알수없는 파일형식입니다.");
	}
		
	
	
}
}

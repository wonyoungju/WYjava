package com.kh.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나입력해 주세요:");
		char ch = sc.next().charAt(0);
		boolean rsult = (65<ch) && (ch<96);//아스키 코드로 하는법
	    System.out.print("영어 대문자인지 확인:"+rsult);
	    
		
		
		
		
	}
	// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
	// 문자 하나 입력해주세요 : a
	// 영어 대문자 확인 : false

	// 문자 하나 입력해주세요 : A
	// 영어 대문자 확인 : true

}

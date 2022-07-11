package com.kh.exercise;

import java.util.Scanner;

public class Excercise_Logical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해주세요:");
		int num = sc.nextInt();

		
//		boolean result = (1 < num) && (num < 100);

		String result = (1 < num) && (num < 100) ? "true" : "false" ;
		System.out.println("1부터 100 사이의 숫자인가?:" + result);

	}

	// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하시오
	// 정수를 하나 입력해주세요 : 33
	// 1부터 100사이의 숫자인가? : true

}

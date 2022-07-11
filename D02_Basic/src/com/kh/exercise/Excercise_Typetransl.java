package com.kh.exercise;

import java.util.Scanner;

public class Excercise_Typetransl {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자 하나 입력해 주세요:");
		int in = sc.nextInt();
		
		System.out.println("문자로 변환:"+ (char) in);//=>강제 형 변환
	}

}

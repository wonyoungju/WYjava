package com.kh.exercise;

import java.util.Scanner;

public class Excercise_Logical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է����ּ���:");
		int num = sc.nextInt();

		
//		boolean result = (1 < num) && (num < 100);

		String result = (1 < num) && (num < 100) ? "true" : "false" ;
		System.out.println("1���� 100 ������ �����ΰ�?:" + result);

	}

	// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���Ͻÿ�
	// ������ �ϳ� �Է����ּ��� : 33
	// 1���� 100������ �����ΰ�? : true

}

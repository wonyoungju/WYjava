package com.kh.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��Է��� �ּ���:");
		char ch = sc.next().charAt(0);
		boolean rsult = (65<ch) && (ch<96);//�ƽ�Ű �ڵ�� �ϴ¹�
	    System.out.print("���� �빮������ Ȯ��:"+rsult);
	    
		
		
		
		
	}
	// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
	// ���� �ϳ� �Է����ּ��� : a
	// ���� �빮�� Ȯ�� : false

	// ���� �ϳ� �Է����ּ��� : A
	// ���� �빮�� Ȯ�� : true

}

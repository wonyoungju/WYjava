package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int num = sc.nextInt();
		String result = 0==num? "0" : 0<num? "���":"����"  ;
		
		
		System.out.println(num+"��/��"+result+"�Դϴ�.");
	}
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���..
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	// ������ �Է����ּ��� : -1
	// -1��/�� �����Դϴ�.

	// ������ �Է����ּ��� : 1
	// 1��/�� ����Դϴ�.

	// ������ �Է����ּ��� : 0
	// 0��/�� 0�Դϴ�.


}

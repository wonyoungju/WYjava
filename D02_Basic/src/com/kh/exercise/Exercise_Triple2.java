package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ��:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ��:");
		int num2 = sc.nextInt();
		
		System.out.print("������ �Է�:");
		char ch = sc.next().charAt(0);
//		String result = ch == '+'  ? num1 + num2+"" : ch == '-' ? num1 - num2 +"": "�߸� �Է��ϼ̽��ϴ�!";
		String result = ch == '+'  ? String.valueOf(num1 + num2): ch == '-' ? String.valueOf( num1 - num2) : "�߸� �Է��ϼ̽��ϴ�!";
	
		
		System.out.println("���:"+  result);
		
	}
	// �� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	// ��, '+', '-' �̿��� ������ �Է½� "�߸��Է��ϼ̽��ϴ�!" ���

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : +
	// ��� : 18

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : -
	// ��� : -6

}

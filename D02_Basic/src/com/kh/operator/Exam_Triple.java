package com.kh.operator;

public class Exam_Triple {
	public static void main(String[] args) {// �żҵ�
		/*
		 * ���׿����� �׸��� 3�� (���ǽ�) ? ���϶� : �����϶� -���ǽ��� �ݵ�� true or false -��/�� �����ڰ� �ַ� ���
		 */
		int num = 2;
		// +,-,*,/,%(��ⷯ��)
		String resultStr;
		
		resultStr = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num+ "��/��"+resultStr+"�Դϴ�.");
	}
}

package com.kh.operator;

public class Exam_Unary {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		boolean flag = true;

		int x = 100;
		int y = 33;
		int z = 0;

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;

		System.out.println("1�� ����");
		System.out.println("a++ ;");
		System.out.println("b = (--a) + b ;");
		System.out.println("c = (a++) + (--b) ;");
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		System.out.println();
		System.out.println("2�� ����");
		System.out.println("����� : " + !!!!flag);
		System.out.println();
		System.out.println("3�� ����");
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);

	}

}

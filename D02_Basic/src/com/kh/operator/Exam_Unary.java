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

		System.out.println("1번 문제");
		System.out.println("a++ ;");
		System.out.println("b = (--a) + b ;");
		System.out.println("c = (a++) + (--b) ;");
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		System.out.println();
		System.out.println("2번 문제");
		System.out.println("결과값 : " + !!!!flag);
		System.out.println();
		System.out.println("3번 문제");
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);

	}

}

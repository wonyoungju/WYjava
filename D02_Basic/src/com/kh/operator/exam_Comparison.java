package com.kh.operator;

public class exam_Comparison {
	public static void main(String[] args) {// 출력을 도와주는 세팅값
		System.out.println("비교연산자 예제");
		// 비교연산자 : 두 값을 비교하는 연산자,관계 연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함.
		int a = 50;
		int b = 30;

		boolean result = a < b;
		System.out.println("(a < b)의 결과:" + result);
		result = a > b;
		System.out.println("(a > b)의 결과:" + result);
		result = a == b;
		System.out.println("(a == b)의 결과:" + result);
		result = a != b;
		System.out.println("(a != b)의 결과" + result);
		
		//짝수 홀수 판별
//		boolean result5;
//		int num2 = 2;
//		result5 =( num2 % 2)==0 ;
//		System.out.println(result5);
//		if result ==true{
//			System.out.println("짝수");
//			}
//		else {
//			System.out.println("홀수");
//		}
		}
		
		
	}



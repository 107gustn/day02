package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
	 	제어문 : 프로그램의 흐름을 제어한다.
	 	if, switch, for, while, do while
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료");
		System.out.print(">>> : ");
		num = sc.nextInt(); // 사용자로부터 수를 입력 받음
		
		if(num == 1) { //(조건식) //조건이 참이면 문장 실행
			System.out.println("쉬운게임 실행"); //종속문장
		}
		if(num == 2) { //조건식이 거짓이면 실행하지 않음
			System.out.println("어려운게임 실행");
		}
		if(num == 3) {
			System.out.println("게임 종료");
		}
		
	}

}

package day02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iNum, num1, num2;
		
		System.out.print("수 입력 : ");
		iNum = sc.nextInt();
		
		String rNum = (iNum / 2 == 0) ? "홀수" : "짝수";
		System.out.println(iNum + " = " + rNum);
		
		String sRes = (iNum / 3 == 0) ? "3의 배수" : "3의 배수가 아니다.";
		System.out.println(iNum + " = " + sRes);
		
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);
		
		String Tnum = (num1 > num2) ? "num1이 num2보다 크다." : "num2가 num1보다 크다.";
		System.out.println(Tnum);

	}

}

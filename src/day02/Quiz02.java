package day02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iNum, num1, num2;
		
		System.out.print("�� �Է� : ");
		iNum = sc.nextInt();
		
		String rNum = (iNum / 2 == 0) ? "Ȧ��" : "¦��";
		System.out.println(iNum + " = " + rNum);
		
		String sRes = (iNum / 3 == 0) ? "3�� ���" : "3�� ����� �ƴϴ�.";
		System.out.println(iNum + " = " + sRes);
		
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);
		
		String Tnum = (num1 > num2) ? "num1�� num2���� ũ��." : "num2�� num1���� ũ��.";
		System.out.println(Tnum);

	}

}

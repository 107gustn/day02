package day02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = input.next();
		
		System.out.print(name + "���� ���� ���� : ");
		int gscore = input.nextInt();
		
		System.out.print(name + "���� ���� ���� : ");
		int escore = input.nextInt();
		
		System.out.print(name + "���� ���� ���� : ");
		int mscore = input.nextInt();
		
		int sum = gscore + escore + mscore;
		
		System.out.println();
		System.out.println("=============");
		System.out.println("�� �� : " + name);
		System.out.println("=============");
		System.out.println("�� �� : " + gscore);
		System.out.println("�� �� : " + escore);
		System.out.println("�� �� : " + mscore);
		System.out.println("=============");
		System.out.println("�� �� : " + sum);
		System.out.println("=============");

	}

}

package day02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int kScore, mScore, EScore;
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		name = input.next();
		
		System.out.print(name + "���� ���� ���� : ");
		kScore = input.nextInt();
		
		System.out.print(name + "���� ���� ���� : ");
		EScore = input.nextInt();
		
		System.out.print(name + "���� ���� ���� : ");
		mScore = input.nextInt();
		
		System.out.println();
		System.out.println("=============");
		System.out.println("�� �� : " + name);
		System.out.println("=============");
		System.out.println("�� �� : " + kScore);
		System.out.println("�� �� : " + EScore);
		System.out.println("�� �� : " + mScore);
		System.out.println("=============");
		System.out.println("�� �� : " + (kScore + EScore + mScore));
		System.out.println("=============");

	}

}

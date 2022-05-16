package day02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int kScore, mScore, EScore;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		
		System.out.print(name + "님의 국어 점수 : ");
		kScore = input.nextInt();
		
		System.out.print(name + "님의 영어 점수 : ");
		EScore = input.nextInt();
		
		System.out.print(name + "님의 수학 점수 : ");
		mScore = input.nextInt();
		
		System.out.println();
		System.out.println("=============");
		System.out.println("이 름 : " + name);
		System.out.println("=============");
		System.out.println("국 어 : " + kScore);
		System.out.println("영 어 : " + EScore);
		System.out.println("수 학 : " + mScore);
		System.out.println("=============");
		System.out.println("합 계 : " + (kScore + EScore + mScore));
		System.out.println("=============");

	}

}

package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
	 	��� : ���α׷��� �帧�� �����Ѵ�.
	 	if, switch, for, while, do while
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print(">>> : ");
		num = sc.nextInt(); // ����ڷκ��� ���� �Է� ����
		
		if(num == 1) { //(���ǽ�) //������ ���̸� ���� ����
			System.out.println("������� ����"); //���ӹ���
		}
		if(num == 2) { //���ǽ��� �����̸� �������� ����
			System.out.println("�������� ����");
		}
		if(num == 3) {
			System.out.println("���� ����");
		}
		
	}

}
package day02;

import java.util.Scanner;


/*
���� �����ݾ��� �Է¹ް� �޴��� ��� ���� �ܵ��� ���Ͻÿ�.
���� �����ݾ��� �Է��ϼ��� : 10000(�Է�)
==================
1. «�� : 5500��
2. ¥�� : 5000��
3. ������ : 8000��
==================
�ֹ��Ͻ� ������ �������� : 1(�Է�0)
�ֹ��Ͻ� �޴��� «���Դϴ�.
������ 5500�� �Դϴ�.
�ܵ��� 4500�� �Դϴ�.
 */
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jjam = 5500, jja = 5000, tang = 8000, total = 0;
		
		System.out.print("���� �����ݾ��� �Է��ϼ��� : ");
		int mymoney = sc.nextInt();
		
		System.out.println("==================");
		System.out.println("1. «�� : 5500��");
		System.out.println("2. ¥�� : 5000��");
		System.out.println("3. ������ : 8000��");
		System.out.println("==================");
		System.out.print("�ֹ��Ͻ� ������ �������� : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("�ֹ��Ͻ� �޴��� «���Դϴ�.");
			System.out.println("������ 5500�� �Դϴ�.");
			total = mymoney - jjam;
			System.out.println("�ܵ��� " + total +"�� �Դϴ�.");
		}
		if(num == 2) {
			System.out.println("�ֹ��Ͻ� �޴��� ¥���Դϴ�.");
			System.out.println("������ 5000�� �Դϴ�.");
			total = mymoney - jja;
			System.out.println("�ܵ��� " + total +"�� �Դϴ�.");
		}
		if(num == 3) {
			System.out.println("�ֹ��Ͻ� �޴��� �������Դϴ�.");
			System.out.println("������ 8000�� �Դϴ�.");
			total = mymoney - tang;
			System.out.println("�ܵ��� " + total +"�� �Դϴ�.");
		}
		
	}
}
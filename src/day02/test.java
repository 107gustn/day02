package day02;

import java.util.Scanner;

/*
�ڽ��� �����޿� ������ ������ ����
�������� �� �հ踦 ����Ͻÿ�.
 */
public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fnum, snum, tsum;
		int python = 350000, java = 220000, linux = 110000;
		
		
		System.out.println("=================================");
		System.out.println("1. Python : 350,000��");
		System.out.println("2. Java : 220,000��");
		System.out.println("3. Linux : 110,000��");
		System.out.println("=================================");
		System.out.print("������ ������ �ΰ��� ���ÿ�. : ");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		
		if(fnum == 1) {
			System.out.println("������û ������ Python �Դϴ�.");
			fnum = python;
		}
		if(snum == 1) {
			System.out.println("������û ������ Python �Դϴ�.");
			snum = python;
		}
		if(fnum == 2) {
			System.out.println("������û ������ java �Դϴ�.");
			fnum = java;
		}
		if(snum == 2) {
			System.out.println("������û ������ java �Դϴ�.");
			snum = java;
		}
		if(fnum == 3) {
			System.out.println("������û ������ Linux �Դϴ�.");
			fnum = linux;
		}
		if(snum == 3) {
			System.out.println("������û ������ Linux �Դϴ�.");
			snum = linux;
		}
		
		tsum = fnum + snum;
		System.out.println("�� ���� ������ : " + tsum + "�Դϴ�.");

	}

}

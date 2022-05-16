package day02;

import java.util.Scanner;

/*
자신이 다음달에 수강할 과목을 고르고
수강과목 총 합계를 출력하시오.
 */
public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fnum, snum, tsum;
		int python = 350000, java = 220000, linux = 110000;
		
		
		System.out.println("=================================");
		System.out.println("1. Python : 350,000원");
		System.out.println("2. Java : 220,000원");
		System.out.println("3. Linux : 110,000원");
		System.out.println("=================================");
		System.out.print("수강할 과목을 두가지 고르시오. : ");
		fnum = sc.nextInt();
		snum = sc.nextInt();
		
		if(fnum == 1) {
			System.out.println("수강신청 과목은 Python 입니다.");
			fnum = python;
		}
		if(snum == 1) {
			System.out.println("수강신청 과목은 Python 입니다.");
			snum = python;
		}
		if(fnum == 2) {
			System.out.println("수강신청 과목은 java 입니다.");
			fnum = java;
		}
		if(snum == 2) {
			System.out.println("수강신청 과목은 java 입니다.");
			snum = java;
		}
		if(fnum == 3) {
			System.out.println("수강신청 과목은 Linux 입니다.");
			fnum = linux;
		}
		if(snum == 3) {
			System.out.println("수강신청 과목은 Linux 입니다.");
			snum = linux;
		}
		
		tsum = fnum + snum;
		System.out.println("총 수강 가격은 : " + tsum + "입니다.");

	}

}

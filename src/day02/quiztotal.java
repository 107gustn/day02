package day02;

import java.util.Scanner;

public class quiztotal {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String name;
	      int age;
	      
	      System.out.print("�̸��� �Է����ּ��� : ");
	      name = sc.nextLine();
	      
	      System.out.print("���̸� �Է����ּ��� : ");
	      age = sc.nextInt();
	      
	      if(age >= 20) {
	    	  System.out.println(name + "���� ���� �Դϴ�.");
	      }
	      if(age < 20) {
	    	  System.out.println(name + "���� �̼����� �Դϴ�.");
	      }

	}
}

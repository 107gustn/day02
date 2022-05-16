package day02;

import java.util.Scanner;

public class quiztotal {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String name;
	      int age;
	      
	      System.out.print("이름을 입력해주세요 : ");
	      name = sc.nextLine();
	      
	      System.out.print("나이를 입력해주세요 : ");
	      age = sc.nextInt();
	      
	      if(age >= 20) {
	    	  System.out.println(name + "님은 성인 입니다.");
	      }
	      if(age < 20) {
	    	  System.out.println(name + "님은 미성년자 입니다.");
	      }

	}
}

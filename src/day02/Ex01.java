package day02;

//import : 해당하는 기능을 가지고 옴
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		final String KOREA = "대한민국"; //변수값이 절대로 바뀌면 안되는 것은 final 키워드를 선언해준다. //final로 변수를 만들면 변수명을 대문자로 해준다.
		System.out.println( KOREA );
		//KOREA = "만세";
		//System.out.println( KOREA );
		
		//자료형 변수;
		//int a;
		
		//입력받는 기능
		Scanner input = new Scanner(System.in);//Scanner : 자료형, input : 변수
		
		//프로그램은 위에서부터 순차적으로 진행한다.
		System.out.print("이름 입럭 : "); //이름입력 출력
		String name = input.next(); //변수값을 이용해서 입력받는 기능을 통해 문자열을 저장한다.
		
		int age; //변수 선언
		System.out.print("나이 입력 : "); //나이입력 출력
		age = input.nextInt(); //입력하면 입력한 값이 해당 변수에 저장되어 대입된다. // 정수의 값만 저장한다
		
		System.out.println(name + "님의 나이는 " + age);

	}
}

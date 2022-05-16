package day02;

public class Ex04 {
	public static void main(String[] args) {
		int num = 1;
		
		//삼항연산자보다는 if문을 많이 이용한다.
		if(num%2 == 0) {
			System.out.println("짝수\n");
		}
		if(num%2 != 0) {
			System.out.println("홀수\n");
		}
		
		if(num < 10) // 조건식이 참이면 if문 종속문장 실행, 거짓이면 다음문장 실행
		{//if문장에 대한 종속 문장이 여러개면 {중괄호}로 묶어준다.
			System.out.println("1. " + num + "은 10보다 작다"); //if문에 대한 종속문장 //if문 조건이 참 이여야만 실행된다.
			System.out.println("2. " + num + "은 10보다 작다");
			System.out.println("3. " + num + "은 10보다 작다");
		}
		System.out.println("다음 문장들 실행"); //다음 문장
	}

}

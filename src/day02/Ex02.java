package day02;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 9, num2 = 2;
		
		System.out.println(num1 / num2); //나눗셈 //정수 / 정수 = 정수값 몫
		System.out.println(num1 / (double)num2); //정수 / (형변환)실수 = 실수값 
		System.out.println(num1 / 2.0 ); //정수 / 실수 = 실수값
		System.out.println(num1 % num2); //정수 / 정수 = 나머지 값
		System.out.println();
		
		/*
		복합 대입 연산자
		a = 10, b = 5;
		a = a + b; => a+=b;
		a = a * b; => a*=b; 
		*/
		
		int a = 10, b = 5;
		a += b;
		System.out.println(a);
		System.out.println();
		
		int su1, su2;
		su1 = su2 = 5;
		System.out.println(su1 += 1); //su1(6) = su1(5) + 1
		System.out.println(su1 -= 1); //su1(5) = su1(6) - 1
		System.out.println(su1 *= su2); //su1(25) = su1(5) * (5)su2
		System.out.println(su1 /= su2); //su1(5) = su1(25) / (5)su2
		System.out.println(su1 %= su2); //su1(0) = su1(5) % (5)su2
		System.out.println();
		
		
		/*
		관계 연산자 : 결과적으로는 참(true)또는 거짓(false)
		a = 10, b = 5;
		a > b : true
		a <= b : false
		a == b : false //이항 연산자
		a != b : true //값 반전
		10 > 5 > 2 : 사용 X
		관계연산자는 이항연산자이며 연산자 사이 피 연산자가 2개 온다.
		*/
		
		System.out.println("===============");
		double do1 = 3.1, do2 = 3.0;
		System.out.println(do1 <= do2); //false
		System.out.println(do1 >= do2); //true
		System.out.println(do1 == do2); //false
		System.out.println(do1 != do2); //true
		System.out.println();
		
		
		/*
		논리 연산자 : 참 또는 거짓 결과
		&&(and) : 모두가 참일때 참
		||(or) : 하나라도 참이면 참
		!(not) : 값을 반전시켜준다.
		*/
		int su3;
		su1 = 10; su2 = 20; su3 = 30;
		System.out.println(su1 > su2 && su1 > su3); //거짓 && 거짓 = 거짓
		System.out.println("=== and ===");
		System.out.println(true && true); //참 && 참 = 참 
		System.out.println(true && false); //참 && 거짓 = 거짓
		System.out.println(false && true); //거짓 && 참 = 거짓
		System.out.println(false && false); //거짓 && 거짓 = 거짓
		System.out.println("=== or ===");
		System.out.println(true || true); //참 || 참 = 참 
		System.out.println(true || false); //참 || 거짓 = 참
		System.out.println(false || true); //거짓 || 참 = 참
		System.out.println(false || false); //거짓 || 거짓 = 거짓
		System.out.println("=== not ===");
		System.out.println(!true); //!참 = 거짓 
		System.out.println(!false); //!거짓 = 참
		System.out.println();
		
		
		/*
		증감 연산자 : 결과적으로 자기자신을 1증가 또는 감소 
		a=10;
		++a : 전치 또는 전위
		a++ : 후치 또는 후위
		a++, ++a => a = a + 1;
		a--, --a => a = a - 1;
		*/
		System.out.println("=== 증감연산자 ==");
		su1 = 10;
		su1++;
		System.out.println(su1);
		
		su1 = 10;
		++su1;
		System.out.println(su1);
		
		su1 = 10;
		su2 = su1++ + 10 * 1; //부호가 뒤쪽에 있으면 모든 연산이 끝난 다음에 자기 자신을 증가시킨다.
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		su1 = 10;
		su2 = ++su1 + 10 * 1; //부호가 앞쪽에 있으면 연산을 후순위로 두고 자기 자신을 먼저 증가시키고 연산을 한다.
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println();
		
		
		/*
	 	삼항 연산자(조건연산자)
	 	변수 = 식 ? 참(값) : 거짓(값); // ? 다음의 결과 값을 저장한다.
		*/
		System.out.println("=== 삼항연산자 ===");
		su1 = 11;
		String s = (su1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(su1 + " : " + s);
		
	}

}

package day02;

//import : �ش��ϴ� ����� ������ ��
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		final String KOREA = "���ѹα�"; //�������� ����� �ٲ�� �ȵǴ� ���� final Ű���带 �������ش�. //final�� ������ ����� �������� �빮�ڷ� ���ش�.
		System.out.println( KOREA );
		//KOREA = "����";
		//System.out.println( KOREA );
		
		//�ڷ��� ����;
		//int a;
		
		//�Է¹޴� ���
		Scanner input = new Scanner(System.in);//Scanner : �ڷ���, input : ����
		
		//���α׷��� ���������� ���������� �����Ѵ�.
		System.out.print("�̸� �Է� : "); //�̸��Է� ���
		String name = input.next(); //�������� �̿��ؼ� �Է¹޴� ����� ���� ���ڿ��� �����Ѵ�.
		
		int age; //���� ����
		System.out.print("���� �Է� : "); //�����Է� ���
		age = input.nextInt(); //�Է��ϸ� �Է��� ���� �ش� ������ ����Ǿ� ���Եȴ�. // ������ ���� �����Ѵ�
		
		System.out.println(name + "���� ���̴� " + age);

	}
}

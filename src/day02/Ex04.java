package day02;

public class Ex04 {
	public static void main(String[] args) {
		int num = 1;
		
		//���׿����ں��ٴ� if���� ���� �̿��Ѵ�.
		if(num%2 == 0) {
			System.out.println("¦��\n");
		}
		if(num%2 != 0) {
			System.out.println("Ȧ��\n");
		}
		
		if(num < 10) // ���ǽ��� ���̸� if�� ���ӹ��� ����, �����̸� �������� ����
		{//if���忡 ���� ���� ������ �������� {�߰�ȣ}�� �����ش�.
			System.out.println("1. " + num + "�� 10���� �۴�"); //if���� ���� ���ӹ��� //if�� ������ �� �̿��߸� ����ȴ�.
			System.out.println("2. " + num + "�� 10���� �۴�");
			System.out.println("3. " + num + "�� 10���� �۴�");
		}
		System.out.println("���� ����� ����"); //���� ����
	}

}

package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_����4 {
	/*
	 * [�����������]
	 * 
	 * 1. 10ȸ �ݺ��� �Ѵ�.
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
	 * ---------------------------------------
	 * . [1] ������(10��)�� ������ ����� ����Ѵ�.
	 * . [2] �հ��� ���� ����Ѵ�.
	 * . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�.
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int a = 0;
		int count = 0;
		int ��Ʈ���� = 60;
		double �л��� = 10;
		for(int i = 1; i<=10; i ++) {
			int r = ran.nextInt(100)+1;
			System.out.println("���� : " + r);
			a += r;						
			if(r >= ��Ʈ����) {
				System.out.println("�հ�");
				count +=1;				
			}
			else {
				System.out.println("���հ�");
			}
			
		}
		System.out.println("���� : " + a);
		System.out.println("��� : " + (a/�л���));
		System.out.println("�հ��ڼ� : " + count);
		
	}

}
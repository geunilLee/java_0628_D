package �׽�Ʈ05_02_����;

import java.util.Random;

public class �ݺ���_����_����������3 {
	public static void main(String[] args) {
		/*
		 * 	�������� 100~200 ������ ���ڸ� 5�� ����Ѵ�. 
		 *  ���� ���� �������� ����Ѵ�.
		 *  �������� ��ġ�� ����Ѵ�.
		 *  
		 *  [��] 
		 *  	112 114 145 176 119
		 *  [����] 
		 *  	������ : 112
		 *  	��ġ : 1
		 * 
		 */
		Random ran = new Random();
		int a = 300;
		int number = 0;
		int i = 1;
		while (i<=5) {
			int r = ran.nextInt(101)+100;
			System.out.println("��ġ : "+i+"    "+ "���� : "+r);
			if(a>r) {
				a=r;
				number = i;
			}
		i+=1;
		}
		System.out.println("��ȣ : "+number+"   "+ "���� ���� : "+a);
	}
}

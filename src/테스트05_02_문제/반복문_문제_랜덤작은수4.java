package �׽�Ʈ05_02_����;

import java.util.Random;

public class �ݺ���_����_����������4 {
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
		for(int i= 1; i <= 5; i++) {
			int r = ran.nextInt(101)+100;
			System.out.println("��ġ : " + i + "   " +"���� : " + r);
			if(a>r) {
				a=r;
				number = i ;
			}
			
		}
		System.out.println("�������� ��ġ : " + number +"   "+"���� ���� : " + a);
	}
}
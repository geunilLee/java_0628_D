package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_����3 {
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
		int total = 0;
		int count = 0;
		int number = 0;
		int c = 0;
		for(int i = 1; i <= 10; i++) {
			int r = ran.nextInt(100)+1;
			System.out.print (i+"��"+"  "+r+"�� : ");
			if(r>=60) {
				System.out.println ("�հ�");
				count+=1;
			}
			else {
				System.out.println ("���հ�");
			}
			if(c<r) {
				c=r;
				number = i;
			}
			//System.out.println(i+"��"+"  "+r+"��");
			total = total +r;
			
		}
		System.out.println("���� : " + total+"   "+"��� : "+ (double)total/10.0);
		System.out.println("�հ� �л��� : " + count);
		System.out.println("1�� �л� : "+number+"��"+"  "+c+"��");
	}

}
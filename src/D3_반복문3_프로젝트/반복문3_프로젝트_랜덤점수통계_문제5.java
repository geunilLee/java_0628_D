package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_����5 {
	/*
	 * [�����������]
	 * 
	 * 1. 10ȸ �ݺ��� �Ѵ�. for
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����) ran
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�. ���ǹ�+ count
	 * ---------------------------------------
	 * . [1] ������(10��)�� ������ ����� ����Ѵ�. ���� a x 
	 * . [2] �հ��� ���� ����Ѵ�.x
	 * . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�. number x
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		
		int count = 0;
		int number = 0;
		int a = 0;
		
		for(int i = 1 ; i <= 10; i ++) {
			int r = ran.nextInt(100)+1;
			number = i;
			System.out.println("��ȣ : " + number +"    "+"���� : " + r);
						
			if(r >= 60) {
				count +=1;
			}
			if(a <= r){				
				a += r;
			}
		}
		System.out.println("------------------------------");
		System.out.println("���� : " + a);
		System.out.println("��� : " + (a/10.0));
		System.out.println("�հ��ڼ� : " + count);
		
	}

}
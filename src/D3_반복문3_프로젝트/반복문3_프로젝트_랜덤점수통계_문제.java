package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_���� {
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
		int count = 0;
		int max = 0;
		int number = 0;
		int total = 0;
		for(int i = 1; i <= 10; i ++) {
			int r = ran.nextInt(100)+1;
			
			if(r >= 60){
				System.out.println(i + "�� �л� �л��հ� : " + r + "��");
				count +=1;
			}
			else {
				System.out.println(i + "�� �л� �л����հ� : " + r + "��");
			}
			if(max < r) {
				max = r;
				number = i;
			}
			total = total + r;
		}
		System.out.println("���� : "+ total + "��� : " + total/10.0 );
		System.out.println("�հ��ڼ� : " + count);
		System.out.println("1�� �հ��� ��ȣ : " + number + "��" + "���� : " + max);
	}

}
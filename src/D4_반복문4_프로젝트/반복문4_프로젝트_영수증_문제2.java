package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������_����2 {
	/*
	 * 
	 * [������ ���]
	 * 1. 5�� �ֹ��� �޴´�.
	 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
	 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
	 * 
	 * ��)
	 * �޴� ���� : 1
	 * �޴� ���� : 1
	 * �޴� ���� : 2
	 * �޴� ���� : 2
	 * �޴� ���� : 3
	 * �� �ݾ� = 31300��
	 * ���� �Է� : 32000
	 * === �Ե����� ������ ===
	 * 1. �Ұ�� ���� : 2��
	 * 2. ����    ���� : 2��
	 * 3. ��         �� : 1��
	 * 4. ��   ��   �� : 31300��
	 * 5. ��         �� : 700��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		int i = 1;
		while (i <= 5) {
			int sel = scan.nextInt();
			if(sel == 1) {
				c1+=1;
			}
			else if(sel == 2) {
				c2+=1;
			}
			else if(sel == 3) {
				c3+=1;
			}
			else {
				System.out.println("����");
				i-=1;
			}
			
			i+=1;
			
		}
		System.out.println("1.�Ұ�� ���� : " + c1 + "��");
		System.out.println("2.����    ���� : " + c2 + "��");
		System.out.println("3.��         �� : " + c3 + "��");
		System.out.println("4. ��    ��    �� :"+ ((price1*c1) + (price2*c2) + (price3*c3)) );
		System.out.println("5. ��          �� : "+ (31300-(price1*c1)+(price2*c2)+(price3*c3)));
	}

}
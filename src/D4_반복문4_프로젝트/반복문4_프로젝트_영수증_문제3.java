package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������_����3 {
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
		int money = 0;
		int sel2 = 0;
		int �Ұ����� = 0;
		int ������� = 0;
		int �ݶ� = 0;
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");		
		
		
		for(int i = 1; i <=5; i++) {
			
			int sel = scan.nextInt();
			System.out.println("�޴� ���� : " + sel );
			if(sel == 1) {
				money += price1; �Ұ�����+=1;
				
			}
			else if(sel == 2) {
				money += price2; �������+=1;
			}
			else if(sel == 3) {
				money += price3; �ݶ�+=1;
			}
			System.out.println("�ѱݾ� : " + money);
			System.out.println("���� �Է� :");
			sel2 = scan.nextInt();
			if(sel2 < money) {
				System.out.println("�ܾ׺���");
			}
		}
		
		System.out.println("1. �Ұ�� ���� : " + �Ұ�����+"��");
		System.out.println("2. ����   ���� : " + �������+"��");
		System.out.println("3. ��    �� : " + �ݶ�+"��");
		System.out.println("�ѱݾ� :  " + money);
		System.out.println("�ܵ� : "+(sel2 - money));
	}

}
package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_��Ÿ�̷�6_�ڷΰ���6 {
	/*
	 * [�ڷΰ���]
	 *      ���θ����θ޴����� �����Ƿ��� ������
	 *      �ڷΰ��� ������������ �����Ƿ� �������� �����ҷ����Ѵ�.
	 * 		
	 * 1. �����Ƿ�
	 * 		1) Ƽ����
	 * 		2) ����
	 * 		3) �ڷΰ���
	 * 2. �����Ƿ�
	 * 		1) �����
	 * 		2) ġ��
	 * 		3) �ڷΰ���
	 * 3. ����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("[1.�����Ƿ�] [2.�����Ƿ�] [3.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[1.Ƽ����] [2.����] [3.�ڷΰ���]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("Ƽ����");
					}else if(sel2 == 2){
						System.out.println("����");
					}
					else if(sel2 == 3) {
						System.out.println("�ڷΰ���");
						run2 = false;
					}					
				}							
			}
			else if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("[1.�����] [2.����] [3.�ڷΰ���]");
					int sel3 = scan.nextInt();
					if(sel3 == 1) {
						System.out.println("�����");
					}
					else if(sel3 == 2) {
						System.out.println("����");
					}
					else if(sel3 == 3) {
						System.out.println("�ڷΰ���");
						run3 = false;
					}
				}
			
			}
			else if(sel == 3) {
				System.out.println("����");
				run = false;
			}
			
		}
		
		
		
	}

}
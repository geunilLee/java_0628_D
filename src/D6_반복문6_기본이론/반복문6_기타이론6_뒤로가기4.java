package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_��Ÿ�̷�6_�ڷΰ���4 {
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
		
		
		boolean run = true;// �ڷΰ��� �ϴ½���
		while(run) {// ù��° �ݺ���
			System.out.println("1. �����Ƿ�");
			System.out.println("2. �����Ƿ�");
			System.out.println("3. ����");
		
			System.out.println("�޴��� �Է��Ͻÿ�.");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean run2 = true; 
				while(run2) {// �ι�° �ݺ��� 
					System.out.println("1) Ƽ����");
					System.out.println("2) ����");
					System.out.println("3) �ڷΰ���");//�̻� �ȳ���
				
					System.out.println("�޴��� �Է��Ͻÿ�.");// �ȳ��� �߰�
					int sel2 = scan.nextInt();// 3����������
				
					if(sel2 == 1) {
						System.out.println("Ƽ����");
					}
					else if(sel2 == 2) {
						System.out.println("����");
					}
					else if(sel2 == 3) {// 3���ý� �ڷΰ���
						System.out.println("�ڷΰ���");
						run2 = false;// �ڷΰ���
					}
					
				}
				
			}
			else if(sel == 2) {
			
			}
			else if(sel == 3) {
			System.out.println("����");
			run = false;
			}
		}
	}

}
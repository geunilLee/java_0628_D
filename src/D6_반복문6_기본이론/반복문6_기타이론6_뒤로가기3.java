package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_��Ÿ�̷�6_�ڷΰ���3 {
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
		Scanner scan = new Scanner(System.in);// ������� �̵� �������� �Է�
		
		boolean run = true;// �ڷΰ��⸦ ���� ����
		while(true) {//ù��° �ݺ��� ���
			System.out.println("1. �����Ƿ�");// +++++
			System.out.println("2. �����Ƿ�");//++++++
			System.out.println("3. ����");// �̻� 3���� ����
			
			System.out.println("�޴� ����");
			int sel = scan.nextInt();// �Է°��� 1~3 ���� �Է��� �޾ƶ�
			if(sel == 1) {
				boolean run2 = true;// �ڷΰ����ϸ� ���ƿ�����
				while(run2) {// 1�����ý� �ȿ��� ���ƾ��� 2��° �ݺ���
					System.out.println("1) Ƽ����");//+++++
					System.out.println("2) ����");//+++++
					System.out.println("3) �ڷΰ���");//+++++
					System.out.println("�޴� ����");//�̻� �ȳ���			
					int sel2 = scan.nextInt();// �ι�° �Է� �� �Է� �޴´�
					if(sel2 == 1) {
						System.out.println("Ƽ����");
					}
					else if(sel2 == 2) {
						System.out.println("����");
					}
					else if(sel2 == 3) {
						System.out.println("�ڷΰ���");
						run2 = false; // Ʈ�縦 ������ �ٲ��ָ� �ڷΰ���
					}
				}	
			}
			if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("1) Ƽ����");
					System.out.println("2) ����");
					System.out.println("3) �ڷΰ���");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
					System.out.println("Ƽ����");
					}
					else if(sel2 == 2) {
					System.out.println("����");
					}
					else if(sel2 == 3) {
					System.out.println("�ڷΰ���");
					run3 = false;
					}
							
				}								
			}
			if(sel == 3) {
				System.out.println("����");
				run = false;
				break;
			}
			
						
		}
	}

}
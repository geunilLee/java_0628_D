package D6_�ݺ���6_������Ʈ;

import java.util.Scanner;

public class �ݺ���6_������Ʈ_rpg����Ž�� {
	/*
       [�ݺ��� ����������Ʈ] �ð����Ѿ��� �����Ӱ� �ϸ�ȴ�.
	 * [����Ž�����]
	 * �÷��̾�� ���� �� ü�� �� �� ���� �����Ͱ� �ִ�. (���ο� ���� �߰� ����)
	 * �÷��̾�� ���� 1������ �ϰ� 2���̻��� ���� �迭���� �����ϴ�.
	 * 
	 * 1) ���θ޴� ==> [1.����] [2.���尣] [3.����] [0.����]
	 * 
	 * 2) [1.����] �� �������� �Ҹ��� ü�°� ��ųȸ�� �Ǵ� �����۱����� �Ѵ�.
	 * 				 ==> [1.����(ü��,��ųȸ��)][2.���౸��][0.�ڷΰ���]
	 * 3) [2.���尣] �� �������� �Ҹ��� �������� ����� �� ���׷��̵� �����ش�. 
	 * 			    ==> [1.�����][2.����][0.�ڷΰ���]
	 * 4) [3.����] �� ���͸� ���� �������Ѵ�. ==> [1.����][2.��ų][3.����Ա�][0.�ڷΰ���]
	 * 			��ų�� 2�� ������ �Ѵ�.
	 * 			������ ������ ü���� ȸ���Ѵ�. 
	 * 			�¸��ϸ� ���� ȹ���Ѵ�. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ����ü�� = 0;
		int �ִ�ü�� = 0;
		
		int ���ݷ� = 0;
		int ���� = 0;
		
		int ���ళ�� = 0;
		int ��ų���� = 0;
		int ������ = 0;
		
		int ��������ü�� = 0;
		int �����ִ�ü�� = 0;
		int ���Ͱ��ݷ� = 0;
		int ���ͼ����� = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("[1.����] [2.���尣] [3.����] [0.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[1.����(ü��,��ųȸ��)][2.���౸��][0.�ڷΰ���]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("ü��,��ųȸ��");
					}
					else if(sel2 == 2) {
						System.out.println("���౸�ſϷ�");
					}
					else if(sel2 == 0) {
						System.out.println("�ڵ��ư���");
						run2 = false;
					}					
				}				
			}
			else if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("[1.�����][2.����][0.�ڷΰ���]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("�����");
					}
					else if(sel2 == 2) {
						System.out.println("����");
					}
					else if(sel2 == 0) {
						System.out.println("�ڷΰ���");
						run3 = false;
					}					
				}	
				
			}
			else if(sel == 3) {
				boolean run4 = true;
				while(run4) {
					System.out.println("[1.����][2.��ų][3.����Ա�][0.�ڷΰ���]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("����");
					}
					else if(sel2 == 2) {
						System.out.println("��ų");
					}
					else if(sel2 == 3) {
						System.out.println("����Ա�");
						
					}
					else if(sel2 == 0) {
						System.out.println("�ڷΰ���");						
						run4 = false;						
					}
				}
				
			}
			else if(sel == 0) {
				System.out.println("����");
				run = false;
			}
			
			
		}
		
	}
	
}
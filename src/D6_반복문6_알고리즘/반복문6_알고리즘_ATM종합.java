



package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM���� {
	/*
	 * [ATM]
	 *  [�ڷΰ���] �� Ȱ���� �ܰ躰�� ����� �����Ѵ�. 
	 * 	[ȸ������] �� ���� �迭���� �����ϴ�.
	 * 
	 * ����ȭ����         ==> [1.�α��� 0.���� ]
	 * 1�� �α��� ���ý�     ==> [1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]  
	 * 2�� ���� ���ý�       ==> [����] 
	 * -------------------------------------------------
	 * [�߰�����] 
	 * [1] 5.�������� ���ý� ==> ��й�ȣ�� �ٲܼ��ִ�.
	 * [2] 0.�α׾ƿ� ���ý� ==> �ڷ� ���ư��� [1.�α��� 0.����] ȭ���� �ٽó��´�.         
	 * [3] �α��� 3�����н� ���� �����Ѵ�. 
	 *
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1; // -1(�α׾ƿ�), 1111(dbAcc1�α���), 2222(dbAcc2�α���)
		
		int count = 0;
		boolean run = true;
		while(run == true){
			System.out.println("[1.�α��� 0.���� ]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {					
					System.out.println("���̵� �Է��Ͻÿ�.");
					int id = scan.nextInt();
					System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
					int pw = scan.nextInt();
					
					if(id == dbAcc1 && pw == dbPw1) {
					log = id;
					count = 0;
					System.out.println(dbAcc1 +"�� �α��μ���.");					
					}
					else if(id == dbAcc2 && pw == dbPw2) {
					log = id;
					count = 0;
					System.out.println(dbAcc2 +"�� �α��μ���.");
					}					
					else {
					System.out.println("�α��� ����");
					count +=1;
					System.out.println(count + "ȸ ���� �α��ν���");
					}
					if (count == 3){						
						run = false;
					}
				}
			}
			else if(sel == 0) {
				System.out.println("����");
				break;
			}
			
			if(log != -1){
				while(true) {
					System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
					int sel2 = scan.nextInt();					
					if(sel2 == 0) {
						System.out.println(log + "�α׾ƿ�");
						log = -1;
						break;
					}
					else if(sel2 == 1){
						System.out.println("�Ա��� �ݾ� �Է�");
						int money = scan.nextInt();
						if(log == dbAcc1) {
							System.out.println(dbAcc1 + "�� ���·� " + money+" �ԱݿϷ�");
							dbMoney1 += money;
							System.out.println("���� " + dbAcc1 + "�� ���� �ܾ� : " + dbMoney1);
						}
						else if(log == dbAcc2) {
						System.out.println(dbAcc2 + "�� ���·� " + money+" �ԱݿϷ�");
						dbMoney2  += money;
						System.out.println("���� " + dbAcc2 + "�� ���� �ܾ� : " + dbMoney2);
						}
						
						
					}
					else if(sel2 == 2) {
						System.out.println("����� �ݾ� �Է�");
						int money = scan.nextInt();
						if(log == dbAcc1) {
							System.out.println(dbAcc1 + "�� ���¿��� " + money+" ��ݿϷ�");
							dbMoney1 -= money;
							System.out.println("����" + dbAcc1 + "�� ���� �ܾ� : " + dbMoney1);
							
						}
						else if(log == dbAcc2) {
							System.out.println(dbAcc2 + "�� ���¿��� " + money+" ��ݿϷ�");
							dbMoney2  -= money;
							System.out.println("���� " + dbAcc2 + "�� ���� �ܾ� : " + dbMoney2);
						}
						
					}
					else if(sel2 == 3) {
						System.out.println("��ü�� ���¹�ȣ�Է� : ");
						int acc = scan.nextInt();
						System.out.println("��ü�ұݾ��Է�");
						int money = scan.nextInt();
						
						if(acc == dbAcc2 && log == dbAcc1) {
							dbMoney1 -= money;
							dbMoney2 += money;
							System.out.println(dbAcc2 + "�� ���·� " + money+" �� �ԱݿϷ�");
							System.out.println("���� " + dbAcc1 + "�� ���� �ܾ� : " + dbMoney1);
							System.out.println("��ü�Ϸ�");
						}
						else if(acc == dbAcc1 && log == dbAcc2) {
							dbMoney2 -= money;
							dbMoney1 += money;
							System.out.println(dbAcc1 + "�� ���·� " + money+" �� �ԱݿϷ�");
							System.out.println("���� " + dbAcc1 + "�� ���� �ܾ� : " + dbMoney2);
							System.out.println("��ü�Ϸ�");
						}
						else {
							System.out.println("����");
						}
					}
					else if(sel2 == 4) {
						if(log == dbAcc1) {
							System.out.println(dbMoney1 + "��");							
						}
						else if(log == dbAcc2) {
							System.out.println(dbMoney2 + "��");							
						}
						
					}
					else if(sel2 == 5) {
						while(true) {
							System.out.println("1. ��й�ȣ ����, 2. �ڷΰ���");
							int sel3 = scan.nextInt();
							if(sel3 == 1) {
							System.out.println("������ ��й�ȣ  �Է�");
							int pw = scan.nextInt();
						
							if(log == dbAcc1) {
							dbPw1 = pw;
							}
							else if(log == dbAcc2) {
							dbPw2 = pw;
							}
							System.out.println("��й�ȣ ����Ϸ�");
							}
							else if(sel3 == 2) {
							System.out.println("�ڷΰ���");
							break;
							}
							
						}
						
						
					}
					
				}
			} 
			
		}
	}
	
}


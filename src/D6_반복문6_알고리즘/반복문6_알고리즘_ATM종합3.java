package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM����3 {
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
		

		boolean run = true; // �ڷΰ���
		while(run == true) {// �ݺ��� ���ѹݺ� 
			if(log == -1) {// �� ���ǹ��� �α׾ƿ��� �����϶� �α��ΰ����ϱ⶧���� ���� Ȯ��
				int count = 0;// 3ȸ �̻� �α��� ���н� ���� ����
				System.out.println("[1.�α��� 0.���� ]");
				int sel = scan.nextInt();
				if(sel == 1) {
					
					System.out.println("���̵� �Է��Ͻÿ�.");
					int id = scan.nextInt();
					System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
					int pw = scan.nextInt();
					
					if(id == dbAcc1 && pw == dbPw1) {
						System.out.println(dbAcc1 + "�α��μ���");
						log = id;
					}
					else if(id == dbAcc2 && pw == dbPw2) {
						System.out.println(dbAcc2 + "�α��μ���");
						log = id;
					}
					else {
						System.out.println("�α��� ����");
						count +=1;
						if(count == 3) {
							System.out.println("3ȸ ���� ����");
							run = false;
							break;
						}
					}
					if(log != -1) {
						while(true) {
							System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("�Ա��� �ݾ��Է�");
								int sel7 = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1+=sel7;
									System.out.println("1111�� �����ܾ�" + dbMoney1);
								}
								else if(log == dbAcc2) {
									dbMoney2+=sel7;
									System.out.println("2222�� �����ܾ�" + dbMoney2);
								}
							}
							else if(sel2 == 2) {
								System.out.println("����� �ݾ��Է�"); 
								int sel7 = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1 -= sel7;
									System.out.println("1111�� �����ܾ�" + dbMoney1);
								}
								else if(log == dbAcc2) {
									dbMoney2 -= sel7;
									System.out.println("2222�� �����ܾ�" + dbMoney2);
								}
								
							}
							else if(sel2 == 3) {
								System.out.println("��ü�� ���¹�ȣ �Է�");
								int sel3 = scan.nextInt();
								if(log == dbAcc1) {
									if(sel3 == dbAcc2) {
										System.out.println("��ü�� �ݾ��Է�");
										int sel4 = scan.nextInt();
										dbMoney1 -= sel4;
										dbMoney2 += sel4;
									}
								}
								else if(log == dbAcc2) {
									if(sel3 == dbAcc1) {
										System.out.println("��ü�� �ݾ��Է�");
										int sel4 = scan.nextInt();
										dbMoney1 += sel4;
										dbMoney2 -= sel4;
									}
								}
								System.out.println("��ü�Ϸ�.");	
							}
							else if(sel2 == 4) {						
									if(log == dbAcc1) {
										System.out.println("���� �ܾ� : " + dbMoney1);
									}
									else if(log == dbAcc2) {
										System.out.println("���� �ܾ� : " + dbMoney2);
									}
							}
							else if(sel2 == 5) {
								if(log == dbAcc1) {
									System.out.println("������ ��й�ȣ �Է�");
									 int sel4 = scan.nextInt();
									 dbPw1 = sel4;
									 System.out.println("��й�ȣ ����Ϸ�");
								}
								else if(log == dbAcc2) {
									System.out.println("������ ��й�ȣ �Է�");
									 int sel4 = scan.nextInt();
									 dbPw2 = sel4;
									 System.out.println("��й�ȣ ����Ϸ�");
								}
	
							}
							else if(sel2 == 0) {
								log = -1;
								break;	
							}
						}
						
					}				
				}
				else if(sel == 0) {
					System.out.println("����");
					break;
				}
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
	


	}

}
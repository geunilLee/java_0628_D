package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM����4 {
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
		int count = 0;
		
		int log = -1; // -1(�α׾ƿ�), 1111(dbAcc1�α���), 2222(dbAcc2�α���)
		
		System.out.println("[1.�α��� 0.���� ]");
		int sel = scan.nextInt();
		
		boolean run = true;
		while(run) {
			
			if(log == -1) {
				if(sel == 1) {
						System.out.println("���̵� �Է��Ͻÿ�.");
						int id = scan.nextInt();
						System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
						int pw = scan.nextInt();
						
						if(id == dbAcc1 && pw == dbPw1) {
							System.out.println(dbAcc1+"�� �α��� ����");
							log = id;
						}
						else if(id == dbAcc2 && pw == dbPw2) {
							System.out.println(dbAcc2+"�� �α��� ����");
							log = id;
						}
						else {
							System.out.println("�α��� ����");
							count +=1;
							if(count == 3) {
								System.out.println("3ȸ ���� �α��� ����");
								run = false;
							}
						}
						if(log !=- 1) {
							System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("�Ա��� �ݾ��Է�");
								int money = scan.nextInt();
								
								if(id == dbAcc1) {
									dbMoney1+=money;
									System.out.println(id+"�� �ܾ�" + dbMoney1+"��");
								}
								else if(id == dbAcc2) {
									dbMoney2+=money;
									System.out.println(id+"�� �ܾ�" + dbMoney2+"��");
								}							
							}
							else if(sel2 == 2) {
								System.out.println("����� �ݾ��Է�");
								int money = scan.nextInt();
								if(id == dbAcc1) {
									dbMoney1-=money;
									System.out.println(id+"�� �ܾ�" + dbMoney1+"��");
								}
								else if(id == dbAcc2) {
									dbMoney2-=money;
									System.out.println(id+"�� �ܾ�" + dbMoney2+"��");
								}
							}
							else if(sel2 == 3) {
								System.out.println("��ü�� ���� ����");
								int ss = scan.nextInt();
								System.out.println("��ü�� �ݾ׼���");
								int money = scan.nextInt();
								if(id == dbAcc1 && ss == dbAcc2) {
									dbMoney1-=money;
									dbMoney2+=money;
								}
								else if(id == dbAcc2 && ss == dbAcc1){
									dbMoney1+=money;
									dbMoney2-=money;								
								}
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
}


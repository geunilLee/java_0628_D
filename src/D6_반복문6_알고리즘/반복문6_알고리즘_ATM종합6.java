package D6_�ݺ���6_�˰���;
import java.util.Scanner;
public class �ݺ���6_�˰���_ATM����6 {
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
		boolean run = true;
		while(run == true) {
			System.out.println("[1.�α���][0.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					int count = 0;
					while(true) {
						System.out.println("���̵� �Է� : ");
						int id = scan.nextInt();
						System.out.println("��й�ȣ �Է� : ");
						int pw = scan.nextInt();
						
						if(id == dbAcc1 && pw == dbPw1) {
							log = id;
							System.out.println("�α��μ���");
							break;
						}else if(id == dbAcc2 && pw == dbPw2) {
							log = id;
							System.out.println("�α��μ���");
							break;
						}else {
							System.out.println("�α��ν��� ");
							count += 1;
							System.out.println(count + "�� ���� 3�����н� �α��κҰ�.");
						}
						if(count == 3) {
							run = false;
							break;
						}
					}				
				}	
				if(log != -1) {
					while(true) {
						System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�] ");
						int sel2 = scan.nextInt();
						if(sel2 == 0) {
							log = -1;
							break;
						}else if(sel2 == 1) {
							System.out.println("�Ա��� �ݾ� �Է� : ");
							int money = scan.nextInt();						
							if(log == dbAcc1 ) {
								dbMoney1 += money;
							}else if(log == dbAcc2) {
								dbMoney2 += money;
							}
							System.out.println("�ԱݿϷ�.");
						}else if(sel2 == 2) {
							System.out.println("����� �ݾ� �Է� : ");
							int money = scan.nextInt();						
							if(log == dbAcc1 ) {
								dbMoney1 -= money;
							}else if(log == dbAcc2) {
								dbMoney2 -= money;
							}						
							System.out.println("��ݿϷ�.");
						}else if(sel2 == 3) {
							System.out.println("��ü�� ���¹�ȣ�Է� : ");
							int acc = scan.nextInt();
							System.out.println("��ü�� �ݾ��Է� : ");
							int money = scan.nextInt();					
							if(acc == dbAcc1 && log == dbAcc2 ) {
								dbMoney2 -= money;
								dbMoney1 += money;
							}else if(acc == dbAcc2 && log == dbAcc1) {
								dbMoney1 -= money;
								dbMoney2 += money;
							}
							System.out.println("��ü�Ϸ�.");
			
						}else if(sel2 == 4) {
							if(log == dbAcc1) {
								System.out.println("��ȸ : " + dbMoney1);
							}else if(log == dbAcc2) {
								System.out.println("��ȸ : " + dbMoney2);
							}
						}else if(sel2 == 5) {
							System.out.println("������ ��й�ȣ�Է� : ");
							int pw = scan.nextInt();
							if(log == dbAcc1) {
								dbPw1 = pw;
							}else if(log == dbAcc2) {
								dbPw2 = pw;
							}
							System.out.println("��й�ȣ�� �����˴ϴ�.");
						}
					}
				}				
			}else if(sel == 0) {
				break;
			}
		}
	}
}
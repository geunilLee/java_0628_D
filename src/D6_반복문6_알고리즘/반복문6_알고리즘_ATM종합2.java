package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM����2 {
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
		
		boolean run = false;
		while(run == true) {
			System.out.println("[1.�α��� 0.���� ]");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					
				
				System.out.println("�Ƶ� �Է��Ͻÿ�");
				int id = scan.nextInt();
				System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
				int pw = scan.nextInt();			
				
				if(id == dbAcc1 && pw == dbPw1) {
					log = id;
					System.out.println(dbAcc1 + "�� �α��μ���");
				}
				else if(id == dbAcc2 && pw == dbPw2) {
					System.out.println(dbAcc2 + "�� �α��μ���");
					log = id;
				}
				else {
					System.out.println("�α��ν���");
					count +=1;
					if(count == 3) {
						System.out.println("3ȸ ���ӽ���");
					}
				}
				}			
			
			
			run = true;
			while(true) {
				System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
				int sel3 = scan.nextInt();
				if(sel3 == 1) {
					System.out.println("�Ա��� �ݾ��Է�");
					int sel4 = scan.nextInt();
					
				}
				else if(sel3 == 2) {
					
				}
				else if(sel3 == 3) {   
					System.out.println("�Ա��� �ݾ��Է�");
					int sel5 = scan.nextInt();
					
					
				}
				else if(sel3 == 4) {
	
				}
				else if(sel3 == 5) {
	
				}
				else if(sel3 == 0) {
					run = true;
				}
				
			}	
		}
	}
		
	


	}

}
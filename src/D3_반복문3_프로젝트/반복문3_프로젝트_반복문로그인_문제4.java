package D3_�ݺ���3_������Ʈ;

import java.util.Scanner;

public class �ݺ���3_������Ʈ_�ݺ����α���_����4 {
	/*
	 * 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
	 * 2. �α׾ƿ� . �α��� �� �̿밡��
	 * 3. �α���,�α׾ƿ� ������ log �� ������ �̿��Ѵ�.
	 *  [��] -1(�α׾ƿ�), 1111(id1), 2222(id2)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(�α׾ƿ�), 1111(id1), 2222(id2)

		boolean run = true;
		while (run == true) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log != -1) {
					System.out.println("�̹�" + log + "������ �α�����");
					System.out.println("�α׾ƿ��� �̿밡��");					
					break;
				}
				
				System.out.println("���̵� �Է��Ͻÿ�.");
				int id = scan.nextInt();
				System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
				int pw = scan.nextInt();
				
				if(id == id1 && pw == pw1){
					System.out.println(id1 + "�� �α��� ����");
					log = id;
				}
				else if(id == id2 && pw == pw2){
					System.out.println(id2 + "�� �α��� ����");
					log = id;
				}
				else {
					System.out.println("�α��� ����");
				}				
			} else if (sel == 2) {
				if(log == -1) {
					System.out.println("�̹� �α׾ƿ��� �����Դϴ�.");
					
				}
				else if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ��̵Ǿ����ϴ�");
				}
				
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}
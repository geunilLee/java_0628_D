package D3_�ݺ���3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_�˰���_���ٿ����_���� {
	/*
	 *  [Up & Down ����]
	 * 1. com �� �������� 1~100���̸� �����Ѵ�.
	 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
	 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , 
	 * 	  com �������� "�۴�" ��Ʈ���� 
	 * 4. ������ ���߸� ������ ����ȴ�.
	 */

	public static void main(String[] args) {
		Random ran =new Random();
		Scanner scan = new Scanner(System.in);
		int r = ran.nextInt(100)+1;
		int run = 1;
		while(run == 1) {
			
			System.out.println("�����Է�");
			int sel = scan.nextInt();
			if(r<sel) {
				System.out.println("down");
			}
			else if(r>sel) {
				System.out.println("up");
				//System.out.println(r);
			}
			else if(r == sel ) {
				System.out.println("����");
				System.out.println(r);
				run = 0;
			}
			
			
		}
	}

}
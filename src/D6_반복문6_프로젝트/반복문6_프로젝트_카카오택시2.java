package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý�2 {
	/*
	 * 
	 * [īī�� �ý�]
	 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
	 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
	 * 3. �޴��� �Ʒ��� ����.
	 * 		1) �ӵ����� : 1~3������ ����
	 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
	 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
	 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
	 * 5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int ��� = 0;
		
		while(true) {
			int x = ran.nextInt(21)-10;		
			int y = ran.nextInt(21)-10;
			
			System.out.println("1~3 �ӵ�����");
			int sel = scan.nextInt();
			
			if(sel == 0) {
				System.out.println("����");
				break;
			}
			else if(sel == 1) {
				if(sel > 1 || sel < 3) {
				��� =1;
				}
				
			}
			else if(sel == 2) {
				System.out.println("��(1)��(2)��(3)��(4)");
				int dir = scan.nextInt();
				if(dir < 1 || dir < 4) {
					dir = 1;
				}				
			}
			else if(sel == 3) {
				
			}
			
			
			
		}
	
	}

}
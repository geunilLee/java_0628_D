package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_����Ų���31_2 {
	/*
	 * [����Ų���31]
	 *   ����Ų��� �����̶�, �÷��̾� 2���� �����ư��鼭
	 *   1~3������ ���ڸ� �����Ҽ��ְ�, �׼��ڵ��� ��� ���ؼ� 
	 *   �״������� 31�� �������������� ���°����̴�.
	 * 
	 * 
	 * 1) �� �÷��̾�� �����ư��鼭 1~3�� �����Ѵ�. // turn
	 * 2) ���࿡ �̻��Ѽ��ڸ� �Է��ϸ� 1~3�� �Է��Ҷ����� ����ڱ� �����̴�.
	 * 3) �� �÷��̾ �����Ѽ��ڴ�  total  ������ ��� �����ؼ� ���Ѵ�.
	 * 4) total �� 31�̻� �����ϸ� �¸��ڸ� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int turn = 1 ;
		int total = 0;
				
		
		while(true) {
			System.out.println("����Ų��� : " + total);
			if(turn%2 == 1) {
				
				System.out.println("���� ����");
				int sel = scan.nextInt();
				
				if(sel > 3 || sel < 1) {
				System.out.println("�ٽ��Է�");				
				}
				else {					
					total += sel;
					turn += 1;
				}
			}
			else if(turn%2 == 0) {
				
				System.out.println("�����Է�");
				int sel = scan.nextInt();
				
				if(sel > 3 || sel < 1) {
					System.out.println("�ٽ��Է�");				
				}
				else {					
					total += sel;
					turn += 1;
				}
				
			}
			if(turn%2 == 1) {
				System.out.println("p1 �¸�");
			}
			else {
				System.out.println("p2 �¸�");
			}
		}
	}

}
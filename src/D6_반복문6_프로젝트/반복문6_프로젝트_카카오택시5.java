package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý�5 {
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
		
		int x = 0;
		int y = 0;
		
		int dx = 0;
		int dy = 0;
		
		int speed = 0;
		int dri = 0;
		
		int ��� = 0;
		
		x = ran.nextInt(21)-10;
		y = ran.nextInt(21)-10;
		
		while(true) {
			System.out.println("���ߵ���ġ : " + x + " , " + y);
			System.out.println("������ġ : " + dx + " , " + dy);
			System.out.println("�ӵ� : " + speed + "���� : " + dri);
			//System.out.println("�̵� : [1. ��] [2. ��] [3. ��] [4. ��]");
			System.out.println("[1.�ӵ�] [2.����] [3.�̵�] [0.����]");
			int sel = scan.nextInt();
			if(sel == 0) {
				System.out.println("����");
				break;
			}
			else if(sel == 1) {
				System.out.println("�̵� : [1. ��] [2. ��] [3. ��] [4. ��]");
				System.out.println("�ӵ� ����");
				speed = scan.nextInt();
			}
			else if(sel == 2) {
				System.out.println("�̵� : [1. ��] [2. ��] [3. ��] [4. ��]");
				System.out.println("���� ����");
				dri = scan.nextInt();
			}
			else if(sel == 3) {
				
				if(dri == 1) {
					dx += speed;
				}
				else if(dri == 2) {
					dx -= speed;
				}
				else if(dri == 3) {
					dy -= speed;
				}
				else if(dri == 4) {
					dy += speed;
				}
				
				��� += speed;
				speed = 0;
				dri = 0;
			}
			if(dx == x && dy == y) {
				System.out.println("���� ����");				
				System.out.println("��� : " + (���*50));
				break;
			}
		}
	
	}

}
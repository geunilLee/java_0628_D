package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý�6 {
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
		int dir = 0;
		
		int ��� = 0;
		dx = ran.nextInt(21)-10;
		dy = ran.nextInt(21)-10;
		
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("������ġ : " + x +" , "+ y);
			System.out.println("���ߵǴ� ��ġ : " + dx +" , "+ dy);
			System.out.println("�ӵ� : " + speed + "  " + "���� : " + dir);
			System.out.println("[1.�ӵ�] [2.����] [3.�̵��ϱ�] [0.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("�ӵ��� �����Ͻÿ�-----------");
				speed = scan.nextInt();
				if(sel < 1 && sel > 3) {					
					speed = 1;
				}				
			}
			else if(sel == 2) {
				System.out.println("���� �����Ͻÿ�--[1. ��] [2. ��] [3. ��] [4. ��]");
				dir = scan.nextInt();
				if(dir < 1 && dir > 3) {
					dir = 1;
				}				
			}
			else if(sel == 3) {
				
				if(dir == 1) {
					x+=speed;					
				}
				else if(dir == 2) {
					x-=speed;					
				}				
				else if(dir == 3) {
					y-=speed;					
				}				
				else if(dir == 4) {
					y+=speed;					
				}
				��� += speed;
				speed = 0;
				dir = 0;
			}
			else if(sel == 0) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("����");
			}
			if(dx == x && dy == y) {				
				System.out.println("������ġ : " + x +" , "+ y);
				System.out.println("����");				
				System.out.println("��� : " + (���*50));
				��� = 0;
				speed = 0;
				dir = 0;
				dx = ran.nextInt(21)-10;
				dy = ran.nextInt(21)-10;
				
			}			
			
		}		
	
	}

}
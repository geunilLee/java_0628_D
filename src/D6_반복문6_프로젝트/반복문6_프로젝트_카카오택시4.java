package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý�4 {
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
		Random  ran = new Random();
		
		int dx = 0;
		int dy = 0;
		
		int x = 0;
		int y = 0;
		
		int speed = 0;
		int dir = 0;
		
		int ��� = 50;
		
		x = ran.nextInt(21)-10;
		y = ran.nextInt(21)-10;
		
		while(true) {
			��� += speed;
			System.out.println("���ߵǴ� �Ÿ� : " + "x : " + x + "  " + " y : " + y);
			System.out.println("����Ÿ� : " + "dx : " + dx + "  " + " dy : " + dy);
			System.out.println("�ӵ� �����Ͻÿ�");
			speed = scan.nextInt();
			System.out.println("���� ���� : ��(1)��(2)��(3)��(4)");
			dir = scan.nextInt();
			
			if(speed > 1 && 3 < speed ) {
				System.out.println();
				speed = 1;
			}
			if(dir > 1 && 4 > dir) {
				System.out.println();
				speed = 1;				
			}
			if(dir == 1) {
				dx += speed;
			}
			else if(dir == 2){
				dx-= speed;
			}
			else if(dir == 3){
				dy-= speed;
			}
			else if(dir == 4){
				dy+= speed;
			}
			if(dx == x && dy == y) {
				System.out.println("�����Ͽ����ϴ�.");
				System.out.println("��� : " + (speed * ���));
				break;
			}
			
		}
	
	}

}
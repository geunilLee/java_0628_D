package D3_�ݺ���3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_����2 {
	/*
	 * 
	 *  [���������� ����] (�ݺ������)
	 * 1. ���������� ������ 10ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 1������ 10���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 * 4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
		int c = 0;
		int count = 0;
		int d = 0;
		for(int i = 1; i <= 10; i++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			c = a*b;
			System.out.printf ("%d * %d = ", a ,b);
			System.out.println("�����Է�");
			int sel = scan.nextInt();
			if(c == sel) {
				System.out.println("����");
				count+=10;
			}
			else if(c != sel) {
				System.out.println("����");
				d+=1;
				if(d == 3) {
					System.out.println("3ȸ���� ����");
					break;
				}
			}
		}
		System.out.println("���� : " + count);
		
	}
}
package D3_�ݺ���3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_���� {
	/*
	 * 
	 *  [���������� ����] (�ݺ������)
	 * 1. ���������� ������ 10ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 1������ 10���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 * 4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int combo = 0;
		for(int i = 0; i <= 10; i ++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			int c = a*b;
			System.out.printf ("%d * %d =", a, b);
			
			int me = scan.nextInt();
			if(c == me) {
				
				System.out.println("����");
				count +=1;
				combo = 0;
			}
			else {
				System.out.println("����");
				combo +=1;
			}
			System.out.println("���ӽ��� : " + combo);
			if(combo == 3) {
					System.out.println("3ȸ ���� ����");
					count = 0;
					break;
			}
			
			
		}
		System.out.println("���� : " + count * 10);	
	}
}
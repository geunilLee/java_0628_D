package D3_�ݺ���3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_����1 {
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
		int c = 0;
		int s = 0;
	
		for(int i = 1; i <= 10; i++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			 c = a*b;
			System.out.printf ("%d * %d = ?\n", a,b,c);
			System.out.println("������ ���߽ÿ�.");
			int sel = scan.nextInt();
			if(c == sel){
				System.out.println("����");
				count = 0;
				s +=10;
				
			}else {
				System.out.println("����");
				count+=1;
				
				if(count == 3) {
					System.out.println("3���� ����");
					break;
				}
			}
			
		}
		System.out.println("���� : " + s);
	}
}
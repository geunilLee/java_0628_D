package D2_�ݺ���2_������Ʈ;

import java.util.Random;

public class �ݺ���2_������Ʈ_���ڸ������� {
	public static void main(String[] args) {
		
		/*
		 * [����]
			 1~999 ������ �������ڸ� �����ϰ� �� �ڸ����� ���� ����Ͻÿ�.
			 ��) 8 ==> 8
			 ��) 28 ==> 2 + 8
			 ��) 999 ==> 9 + 9 + 9
		 */
		Random ran = new Random();
		
		int run = 1;
		while(run == 1) {
			int r = ran.nextInt(999)+1;
			int a = r/100;
			int b = r%100/10;
			int c = r%10;
			System.out.println(r);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a+b+c);
		run =0;
		}
		
	
	
	
	
	
	}
}
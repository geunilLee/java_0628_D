
package _��������;

import java.util.Random;

public class _0601_�ֽ�����2 {
	public static void main(String[] args) {
		/*
			ö���� ���� �ֽĿ� ������ ���̱� �����ߴ�. 
			�ֽ��� ��°�� �ñ��ϱ� �����ߴ�. 
			�ֱ� �����ִ� �����ֽ��� ���캸��� �ߴ�.
			������ ����ϴ� �Ⱓ�� ���� �� �Ⱓ�� ����غ���. 
		 	[1] �������� 1~8���� ���� 10���� ���������� ����Ѵ�. 
		  	[2] �������ڴ� �ְ� ��ġ�� ���ϰ�  ���ڰ�ũ�� ��� ������ �϶��̴�. 
		  	[����] �Ʒ��Ͱ��� �������ڰ� ���Դٰ��ϸ�
		  		4 8 3 2 6 7 4 5 6 1
		  		
		  		(1) ó�� 4 - 8 �� ����̰� 8 ������ 3 �̱⶧���� �ִ� ��±Ⱓ�� 1�̴�.
		  		(2) �ٽ� 2 - 6 - 7 �� ����̰� 7������ 4�̱� ������ �ִ��±Ⱓ�� 2�̴�. 
		  		(3) 4 - 5 - 6 �� ����̰�  6 ���� 1�̱⶧���� �ִ��±Ⱓ�� 2�̴�. 
		  		(4) ���� ��ġ�� �����̸� ������� ġ���ʴ´�.    
		  	[����]
		  		2��
		 */
		Random ran = new Random();
		int a = 1;
		int number = 0;
		int b = 0;
		int count = 0;
		boolean check = false;
		for(int i = 1; i<=10; i++) {
			int r = ran.nextInt(8)+1;
			System.out.println("�������� : " + r);
			if(a < r && check == true) {
				System.out.println("�ֽ�   : " + r);
				
				count+=1;
				if(b<count){
					b = count;
				}
				System.out.println("ī��Ʈ  : " + count);
				System.out.println("-----------------");
			}
			else if(a>=r && check == true) {
				System.out.println("�ֽ�   : " + r);
				
				count = 0;
				System.out.println("ī��Ʈ  : " + count);
				System.out.println("-----------------");				
			}
			a=r;
			check = true;		
		}
		System.out.println(" ����ī��Ʈ : " + b);
		
	}
}	
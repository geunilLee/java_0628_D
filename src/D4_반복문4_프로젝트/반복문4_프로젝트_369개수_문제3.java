package D4_�ݺ���4_������Ʈ;

import java.util.Random;

public class �ݺ���4_������Ʈ_369����_����3 {
	/*
	 * [369����]
	  
		  1~ 10000 ������ ���ڸ� �Է¹ް� 
		  3�̳� 6�̳� 9��  ��������Ͻÿ�.
	 
		  ��) 9999 ==> 4
		  ��) 36 ==> 2
		  ��) 1 ==> 0
		  ��) 222 ==> 0  
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		int r = ran.nextInt(10000)+1;
		int temp = r;
		int count = 0;
		while(true) {
			System.out.println(temp);
			int a = temp%10;
			if(a == 3 || a == 6 || a == 9) {
				count+=1;
			}
			
			
			
			temp = temp/10;
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count+" �� ");
	}
}

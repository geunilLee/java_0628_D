package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_369����_����1 {
	/*
	 * [369����]
	  
		  1~ 10000 ������ ���ڸ� �Է¹ް� 
		  3�̳� 6�̳� 9��  ��������Ͻÿ�.
	 
		  ��) 9999 ==> 4
		  ��) 36 ==> 2
		  ��) 1 ==
		  ��) 222 ==> 0> 0  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 1;
		while (i <= 10000) {
			System.out.println("1~1000���� ���ڸ� �Է��Ͻÿ�.");
			int sel = scan.nextInt();
			if(sel%10 == 3 || sel%10 == 6 || sel%10 == 6)
			System.out.println(sel);
	
			
		}
		
	}
}
package D4_�ݺ���4_������Ʈ;

public class �ݺ���4_������Ʈ_369����_����4 {
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
		int count = 0;
		
		for(int i = 1; i<= 1000; i ++) {
			int a = i/1000;
			int b = i%1000/100;
			int c = i%1000%100/10;
			int d = i%10;
			
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			else {
				System.out.println(i);
			}
			System.out.println("369 ���� :  " + count);
			
		
		
	}
}
}
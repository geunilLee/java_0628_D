package �׽�Ʈ05_06_�ݺ���;

import java.util.Random;

public class _0703_7�����ݺ�������3 {
	public static void main(String[] args) {
		  /*
	        �������� (1~9) ������ ����  8���� ����Ѵ�. 
	        �� �Ʒ��� ������ �����Ѵ�. 
	        
	        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
	        �Ʒ��� ���� ����Ѵ�. 
	        
	        [���]
	           4 5 6
	           5 6 1
	           6 1 2
	           1 2 3
	           2 3 4
	           3 4 5 
        
      */
		Random ran = new Random();
		
		int number = 0;
		int count = 2;
		int a = 0;
		
	
		int i = 1;
		
		while(i <= 8) {
			int r = ran.nextInt(9)+1;
			count +=1;
			
			//System.out.println("��ȣ : " + i +"  "+ "���� ���� :" + r);			
			
			if(i <= count) {
				
				a+=1;
				if(a <= 3)
					System.out.print (r);
			}
			i+=1;
			
		}	
		
	}
}
package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����1_����3 {
	/*
	[����] 
	
		6�� 8�� ������� ��� ���
	
		 ������� ���μ��� �����ξ���� ���Ѵ�.
		 ��)    
		 	6 �Ǿ���� 1, 2, 3, 6 �̴�.
		    8 �Ǿ���� 1, 2, 4, 8 �̴�.
		    
		 6�� 8�� �������  1, 2 �̴�.
		 6�� 8�� �ִ������� 2 �̴�.
*/
	
	public static void main(String[] args) {
		int a = 1;
		int count = 0;
		int i = 1;
		while(true) {
			if(8%i == 0 && 6%i == 0) {
//				System.out.println(i);
				if(a <= i) {
					a = i;
					count +=1;
					
					if(count == 2) {
						System.out.println(a);						
						break;						
					}
				}
			}
			i+=1;
		}
		
		
	
	
		
	

	
	}
}
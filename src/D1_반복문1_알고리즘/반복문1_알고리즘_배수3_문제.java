package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���3_���� {
	/*
	 * [����] 
		  50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
		  [��] (54,63,72,81,90,99)  6 �� 
	 */
	
	public static void main(String[] args) {
		int i = 50;
		int run = 1;
		int count = 0;
		int start = 50;
		int max = 100;
		
		while(run == 1) {
			if(i <= max) {			
			
				if(i >= start) {
					if(i%9 ==0) {
						count +=1;
						System.out.println ("���� : " + i);
						System.out.println();
						System.out.println("���� : "+count);					
					}
					
				}			
			i+=1;
			
			}
		}
		
	}
}
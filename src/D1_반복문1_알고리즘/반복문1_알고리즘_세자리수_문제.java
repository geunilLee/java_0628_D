package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���ڸ���_���� {
	
	/*
	 * [����]
	 *  28�� ��� �߿��� ���� ū ���ڸ� ���� ����Ͻÿ�.
	 *  �� : 980 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int run = 1;
		int max = 1000;
		int a = 0;
		while (run == 1) {
			if(i <= max) {
				if(i%28 == 0) {
					if(a <= i) {
						a = i;
					}						
				}					
			}			
			else {
				run = 0;
			}			
			i+=1;
		}
		System.out.println(a);
		
	}
}
		

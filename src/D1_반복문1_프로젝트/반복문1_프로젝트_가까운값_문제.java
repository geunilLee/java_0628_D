package D1_�ݺ���1_������Ʈ;

public class �ݺ���1_������Ʈ_����_���� {
	/*
	 * [����] 
	 * 		1 ���� 200 ������ ������ ���� ���ǿ� ���� �´� ���ڸ� ���.
	 *     	[����1] 6�� ��������
	 *      [����2] 100�� ���尡��� ���� ��� 
	 		
	 		���� : 102
	 */
	  
	public static void main(String[] args) {
		int start = 1;
		int max = 200;
		int a = 100;
		int num = 0;
		int num2 = 0;
		
		int i = 1;
		int run = 1;
		while(run == 1) {
			if(i <= max && i%6 == 0) {
				//System.out.println(i);
				if(i <= a) {
					if (num <= i) {
						num = i;
						//System.out.println("������ : " + num);											
					}
					num2 = num + 6;
					if(num2 - a < a-num) {
						System.out.println("num2");
						run = 0;
					}
					else if(num2 - a > a-num) {
						System.out.println("num");
						run = 0;
					}
				}				
				
				
				
			}
			if(i>max) {
				run = 0;
			}
			
			
			i+=1;
			
		}
	}
}
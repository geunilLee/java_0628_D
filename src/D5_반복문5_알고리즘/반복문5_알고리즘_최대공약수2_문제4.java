package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_����4 {
	/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int max = 0;
		while(i <= 42) {
			
			if(42%i == 0 && 28%i == 0) {
				if(max < i) {
					max = i;
					
				}
				
			}	
			
			i+=1;
		}
		System.out.println(max);
	
	
		

	

	
	}
}

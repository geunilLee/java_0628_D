package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_���� {
	/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	 */
	
	public static void main(String[] args) {
		
		int a = 42;
		int b = 28;
		int c = 0;
		
		
		for (int i = 1; i <= a;  i ++) {
			if(a%i == 0 && b%i == 0) {			
				c = i;
			}			
		}
		System.out.println(c);
	}
}
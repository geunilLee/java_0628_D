package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_����3 {
	/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 42;
		int c = 28;
		
		int i = 1;
		while(true) {
			if(b%i== 0 && c%i == 0) {
				System.out.println(i);
//					if(a <= i) {
//						a = i;						
//					}
			}
			i+=1;
			//System.out.println(a);
		}
		
	}
}
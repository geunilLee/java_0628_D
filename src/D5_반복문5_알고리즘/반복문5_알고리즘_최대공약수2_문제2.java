package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_����2 {
	
	/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	*/
	public static void main(String[] args) {

		int max = 0;
		for(int i = 1; i <= 42; i++) {
			if(42 % i == 0 && 28 % i == 0) {
				System.out.println(i);
				max = i;
			}			
		}
		System.out.println(max);	
	}
}
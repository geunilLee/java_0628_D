package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_���� {

	/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
	*/
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		
		int num1 = a;
		int num2 = b;
		
		for(int i = 1; i == 1;) {
			
			if(num1<num2) {
				num1+=a;
			}
			else if(num1>num2) {
				num2+=b;
			}
			if(num1 == num2) {
				System.out.println(num1);
				break;
			}
		}
		

	}
}
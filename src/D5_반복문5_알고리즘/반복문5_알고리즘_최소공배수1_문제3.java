package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_����3 {

	/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
	*/
	public static void main(String[] args) {
		int i = 1;
		int a = 8;
		int b = 12;
		while(true) {
			if(i%a == 0) {
				System.out.print ("8�� ��� : " + i+"  ");
			}
			if(i%b == 0) {
				System.out.println ("12�� ��� : " + i);
			}
			if(i%a == 0 && i%b == 0) {
				System.out.println("����� " + i);
				break;
			}
			i+=1;
		}
			

	}
}
package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_����2 {

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
		while(true) {
			if(8%i == 0) {
				System.out.println ("8 ��� : " + i + "  ");
			}
			if(12%i == 0) {
				System.out.println ("12 ��� : " +i + "  ");
			}
			if(8%i == 0 && 12%i == 0) {
				System.out.println ("����� : " + i + "  ");
			}
			i+=1;
		}

	}
}
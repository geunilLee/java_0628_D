package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {
	/*
	 * [����]
	   		105�� 63�� 175�� ������� ���Ͻÿ�
	 */
	public static void main(String[] args) {
		int a = 0;
		int i = 1;
		while(i <= 175) {
			if(150%i == 0 && 63%i == 0 && 175%i == 0) {
				a=i;
				System.out.println(a);
			}
			
			
			
			i+=1;

		}
		
	}
}
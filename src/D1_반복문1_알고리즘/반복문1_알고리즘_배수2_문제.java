package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���2_���� {

	/*
	 * [����]
	 *  8�� ����� ���������� 4�� ����Ͻÿ�. 
	 *  �� : 0,8,16,24
	 */
	
	public static void main(String[] args) {
		int run = 0;
		int count = 0;
		int i = 1;
		while(i == 1) {
			if(run%8 == 0) {
				System.out.println(run);
				count+=1;
			}
			if(count == 4) {				
				i = 0;
			}
			
			run +=1;
			
		}
		
	}
}
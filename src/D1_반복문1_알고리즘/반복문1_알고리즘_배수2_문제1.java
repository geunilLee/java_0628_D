package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���2_����1 {

	/*
	 * [����]
	 *  8�� ����� ���������� 3�� ����Ͻÿ�. 
	 *  �� : 8,16,24
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		int run  = 1;
		while(run == 1) {
			if(i%8 == 0) {
				System.out.println(i);
				count +=1;
			}
			if(count == 3) {
				run = 0;
			}			
			i+=1;		
		}
	}
}
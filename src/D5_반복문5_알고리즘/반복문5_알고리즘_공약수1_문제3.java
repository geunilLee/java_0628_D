package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_����3 {
	/*
	 * [����]
	   		105�� 63�� 175�� ������� ���Ͻÿ�
	 */
	public static void main(String[] args) {
		
		
		int count = 0;
		int i = 1;
		while(true) {
//			if(105%i == 0) {
//				System.out.println("105 ��� : " + i + " ");
//				
//			}
//			if(63%i == 0) {
//				System.out.println("63 ��� : " + i + "  ");
//				
//			}
//			if(175%i == 0) {
//				System.out.println("175 ��� : " + i + " ");
//				
//			}					
			if(105%i == 0 && 63%i == 0 && 175%i == 0) {
				System.out.println("����� : " + i);
				count +=1;
				if(count == 2) {
					break;
				}
			}
			
			
			i+=1;
			
		}
		
	}
}
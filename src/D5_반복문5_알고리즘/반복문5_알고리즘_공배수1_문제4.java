package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_����4 {
	/*
	  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		int unm = 12;
		int num2 = 15;
		while(true) {
			if(i%unm == 0 && i%num2 == 0) {
				count +=1;
				System.out.println(i);
				
				if(count == 5) {
					break;
				}
			}
			
			
			i+=1;
		}
	}
}

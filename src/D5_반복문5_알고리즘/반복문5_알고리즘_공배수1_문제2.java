package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_����2 {
	/*
	  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
	 */
	public static void main(String[] args) {
		
		int i = 1; 
		int count = 0;
		while(true) {
			if(i%12 == 0 && i%15 == 0) {
				System.out.println(i);
				count +=1;
				if(count == 5) {
					break;
				}
			}
			
			
			
			
			
			i+=1;
		}
		
		
		
	}
}
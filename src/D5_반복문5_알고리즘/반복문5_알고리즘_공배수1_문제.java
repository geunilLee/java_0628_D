package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {
	/*
	  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
	 */
	public static void main(String[] args) {
		
		int a = 12;
		int b = 15;
		
		int count = 0;
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) {
			
			if(num1 < num2) {
				num1+=a;
				System.out.println("aaaa    "+num1);
			}
			else if(num1 > num2) {
				num2+=b;
				System.out.println("bbbb    "+num2);
			}
			
			
			else if(num1 == num2) {
				count +=1;
				System.out.println(num1);
				num1 += a;
				
			
			}
			if(count == 5) {
				break;
			}
			
		}
		
		
		
	}
}
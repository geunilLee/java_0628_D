package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_��������_���� {
	
	 /*
       [����]
	        ö���� �ι��� ���迡�� ���� 80���� 72���� �޾Ҵ�.
	        �� ��° ���迡�� �ּ� �� ���̻��� �޾ƾ� 
	        
	        ������ ���輺���� ����� 82���̻��� �ɼ� ������?

	  */

	public static void main(String[] args) {
		int a = 80;
		int b = 72;
		int c = 0;
		
		int run = 1;
		while(run == 1) {
			if((double)(a+b+c)/3.0 == 82) {
				System.out.println(c);				
			}
			c+=1;
		}
		
	} 
}
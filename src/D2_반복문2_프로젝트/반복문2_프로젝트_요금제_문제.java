package D2_�ݺ���2_������Ʈ;

public class �ݺ���2_������Ʈ_�����_���� {
	/*
	 * [����]
		  �Ʒ��Ͱ��� �޴������� �ִ� 
		  B�� �����Ұ�� A���� �� �������̵ɷ���,
		  ��ȭ�ð��� �󸶱��� ����ؾߵɱ��? 
		  ������ �ʷ� ���Ͻÿ�.
		  A����� �⺻��� 17500�� �ʴ� 5�� 
		  B����� �⺻��� 31000�� �ʴ� 2��
	      �⺻��뷮�� ���������ʴ´�. 
	      
	 */
	/*
	 b>a
	 run =0;
	 
	 x*a
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		int a����� = 17500;
		int b����� = 31000;
		
		int t = 1;
		int a = 5;
		int b = 2;
		int count = 0;
		
		
		int run = 1;
		while(run == 1) {
			if(a*t >= b�����) {
				System.out.println(a);			
				System.out.println(" a �� : " + t);
				System.out.println(a*t);
				
				run = 0;
			}
			t++;	
			}
		
		run = 1;
		while(run == 1) {
			if(b*t>= b�����) {
				System.out.println(b);			
				System.out.println(" b �� : " + t);
				System.out.println(b*t);
				run = 0;
			}
			
			t++;
	}
}}
package D2_�ݺ���2_������Ʈ;

public class �ݺ���2_������Ʈ_�����_����1 {
	/*
	 * [����]
		  �Ʒ��Ͱ��� �޴������� �ִ� 
		  B�� �����Ұ�� A���� �� �������̵ɷ���,
		  ��ȭ�ð��� �󸶱��� ����ؾߵɱ��? 
		  ������ �ʷ� ���Ͻÿ�.
		  A����� �⺻��� 17500�� �ʴ� 5�� 
		  B����� �⺻��� 31000�� �ʴ� 2��
	      �⺻��뷮�� ���������ʴ´�. 
	      
	      a>=b
	      
	 */
	public static void main(String[] args) {
		int a�⺻��� = 17500;
		int b�⺻��� = 31000;
		
		int a = 5;
		int b = 2;
		
		int t = 1;
		int run = 1;
		while(run == 1){
			if(a�⺻��� + a*t > b�⺻��� + b*t ) {
				System.out.println(a�⺻��� + a*t);
				System.out.println(b�⺻��� + b*t);
				System.out.println(t + " ��");
				run = 0;
			}
			
			
			t+=1;
			
		}
	}
}
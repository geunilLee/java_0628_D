package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_���� {
	/*
	 * [����]
	   	ö���� �μ��� ���� �����忡 �ٴѴ�
	   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
	   	
	   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
	   	
	 */
	public static void main(String[] args) {
		
		 int a = 4;
		 int b = 5;
		 int c = 3;
		 int num1 = a+c;
		 int num2 = b+c;
		 
		 for(int i = 1; i == 1;) {
			 if(num1<num2) {
				 num1+=a;
				 System.out.println("aaa     "    + num1);
			 }
			 else if(num1>num2) {
				 num2+=b;
				 System.out.println("bbbb    " + num2);
			 }
			 if(num1 == num2) {
				 System.out.println(num1);
				 break;
			 }
		 }
		 
	}
}
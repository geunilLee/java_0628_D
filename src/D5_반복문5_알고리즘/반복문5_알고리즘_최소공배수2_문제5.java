package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_����5 {
	/*
	 * [����]
	   	ö���� �μ��� ���� �����忡 �ٴѴ�
	   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
	   	
	   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
	   	
	 */
	public static void main(String[] args) {
		// �轺�� �Ի��ϱⰡ ��������� �ѹ��� �������� �����ִ¹������ ���� ������ ����
		int a = 4;
		int b = 5;
		int start = 3;
		int i = 1;
		
		int num1 = a;
		int num2 = b;// ���� ���� �����ϱ����� �ѹ��� ����
	
		
		while(true) {	
			if(num1<num2) {
				num1+=4;
			}
			else if(num1>num2) {
				num2+=5;
			}
			else if(num1 == num2) {
				System.out.println((i+start));
				break;
			}
			i+=1;	
			
		}
		
	}
}

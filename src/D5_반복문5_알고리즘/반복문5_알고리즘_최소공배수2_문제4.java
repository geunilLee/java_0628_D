package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_����4 {
	/*
	 * [����]
	   	ö���� �μ��� ���� �����忡 �ٴѴ�
	   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
	   	
	   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
	   	
	 */
	public static void main(String[] args) {
		int i = 1;
		int a = 4;
		int b = 5;
		int start = 3;
		
		int num = a;
		int num2 = b;
		while(true) {
			if(num>num2) {
				num2 += b;
			}
			else if(num<num2) {
				num += a;
			}
			else if(num == num2) {
				System.out.println("2�� " + (i+start) + "��");
				break;
			}
			i+=1;
		}
	}
}
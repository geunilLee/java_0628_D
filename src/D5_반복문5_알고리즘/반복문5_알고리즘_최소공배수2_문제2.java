package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_����2 {
	/*
	 * [����]
	   	ö���� �μ��� ���� �����忡 �ٴѴ�
	   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
	   	
	   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
	   	
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int count = 0;
		int start = 3;
		
		int i = 1;
		while(true) {
			if(i%a == 0 && i%b == 0) {
				System.out.println(i);
				count +=1;
				if(count == 1){
					break;
				}
			}
			
			i+=1;
		}
		System.out.println(i+start);
	}
}
package �׽�Ʈ05_02_����;

public class �ݺ���_����_�ǹ���3 {
	public static void main(String[] args) {
		/*
		 * ö���� �������� ���� 50�� ������ �ǹ��ְ� �Ǿ���. 
		 * ö���� ������ ���������Ϳ��� ����4�� ���� ���� �ߴ�. 
		 * ���࿡ ������ 4���� ���ٸ� ���� 5�� �������Ѵ�. 
		 * ö���� ������ ����1������ ����50���̰� , ���� ���������Ϳ� �����ִ� ���ڸ� 1������ ������� ����Ͻÿ�. 
		 * [��]
		 * 		1 2 3 5 6 7 8 9 10 11 12 13 15 .... 66
		 * 
		 */
		int count = 0;
		for(int i = 1; i<=50; i ++) {
			 count = count +1;
			 
			int a = count/10;// 10 20 30 40 50  
			int b = count%10; //  1 23 4 5 6 7 89 
			System.out.println(count);
			if(a == 4) {
				count+=10;
			}
			if(b == 4) {
				count +=1; 
			}
			System.out.println(count);
			System.out.println();
		}
		
		
	}
}

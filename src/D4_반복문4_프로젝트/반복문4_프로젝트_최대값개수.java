package D4_�ݺ���4_������Ʈ;

import java.util.Random;

public class �ݺ���4_������Ʈ_�ִ밪���� {
	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	�������� 1~10 �� 10������ϰ� , 
		 *  ����ū���� ������ ���°�� �ߺ���µ� Ƚ������Ͻÿ�.
		 */
		Random ran = new Random();
		int count = 1;
		int a = 0;
		for(int i = 1; i <= 10; i++   ) {
			int r = ran.nextInt(6)+1;
			System.out.println(r);
			if(a < r) {
				a = r;
				count = 1;
			}
			
			else if(a == r){
				count +=1;
			}
			
		}
		System.out.println("�ִ� �� : " + a);
		System.out.println("�ߺ�Ƚ�� : " + count);
	} 
}

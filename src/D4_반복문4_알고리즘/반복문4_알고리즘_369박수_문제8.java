package D4_�ݺ���4_�˰���;

import java.util.Random;

public class �ݺ���4_�˰���_369�ڼ�_����8 {
	/*
	 * 
	 *  [369����]
	 * 1. 1~50���� �ݺ��� �Ѵ�. for 50ȸ
	 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
	 * 
	 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦" ���� �ڸ��� 3�̰ų� 6�̰ų� 9�̸� ī��Ʈ 1 (����) 
	 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
	 * 5. 3�̳� 6�̳� 9�� ������ �׳� �������    (������ �׳� ���) 
	 * 
	 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		
		
		int s = 1;
		for(int i = 1; i <= 999; i ++) {
			int count = 0;
			int a = s%100/10;
			int b = s%10;
			int c = s/100;
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count +=1;
			}
			if(c == 3 || c == 6 || c == 9) {
				count +=1;
			}
			else {
				System.out.println(s);
			}
			
			if(count == 3) {
				System.out.println("¦¦¦");
			}
			else if(count == 2) {
				System.out.println("¦¦");
			}
			else if(count == 1) {
				System.out.println("¦");
			}
			s+=1;
		}
	}

}
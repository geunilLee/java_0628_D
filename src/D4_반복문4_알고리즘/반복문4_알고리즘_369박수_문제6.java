package D4_�ݺ���4_�˰���;

public class �ݺ���4_�˰���_369�ڼ�_����6 {
	/*
	 * 
	 *  [369����]
	 * 1. 1~999���� �ݺ��� �Ѵ�.
	 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
	 * 
	 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
	 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
	 * 5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
	 * 
	 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
	 */
	public static void main(String[] args) {
		int i = 1;
		while(i <= 999) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			
			int count = 0;
			
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			if(a == 6 || b == 6 || c == 6) {
				count +=1;
			}
			if(a == 9 || b == 9 || c == 9) {
				count +=1;
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
			else {
				System.out.println(i);
			}
			
			
			i+=1;
		}
		
		
	}

}
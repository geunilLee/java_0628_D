package �׽�Ʈ05_06_�ݺ���;
public class �ݺ���_��ܼ���2 {
	public static void main(String[] args) {
		/*
		 * ö���� 30��¥�� ����� �ֻ�ܿ� ���ִ�. 
		 * ���ϾƷ����� ���������� �Ѵ�. 
		 * ö���� �������� ���ʹ߷� ���� ����� ����Ͻÿ�. 
		 * �Ʒ����ǵ��� �����Ͻÿ�.
		 * [����]
		 * [1] ö���� ������ �Ѱ�ܾ� ��������. 
		 * [2] ö���� ù���� ���ʴٸ����� ����� ��������. 
		 * [3] ����� �ټ����Ҷ� ���� �ݴ���ٸ��� �ٲ㼭 ����Ͻÿ�.
		 * 
		 * [����]
		 * 	29 27 25 23 21 
		 *  20 18 16 14 12 
		 *  11 9  7  5  3
		 *  2			 
		 */
		int count = 0;
		int count2 = 0;
		int i = 30;		
		int run = 1;
		while(run == 1) {
			
			if(i%2 != 0) {
				System.out.print (i+ "  ");
				count +=1;
				if(count == 5) {
					run = 0;
				}
			}
			i-=1;
		}
		System.out.println();
		
		i = 30;
		boolean run2 = true;
		while(run2) {
			
			
			if(i%2 == 0) {
				System.out.print(i + "  ");
				count2 +=1;
			}
			if(count2 == 5) {
				
				run2 = false;
			}		
			i-=1;		
		}
		System.out.println();
		for(int a = 12; a >= 0; a--) {
			if(a%2 != 0 && a>=3) {
				System.out.print (a + "   ");
			}
		}
		System.out.println();
		
	}
}
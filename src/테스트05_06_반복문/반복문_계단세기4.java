package �׽�Ʈ05_06_�ݺ���;
public class �ݺ���_��ܼ���4 {
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
		int i = 30;
		int trun = 1;
		int count = 0;
		while(i > 1) {
			i-=1;
			if(trun == 1){
				if(i%2 == 1) {
					System.out.print (i+ "  ");
					count +=1;
					if(count == 5) {
						count = 0;
						trun = 2;
						System.out.println();
					}
				}
				
				
			}
			else if(trun == 2) {
				if(i%2 == 0) {
					System.out.print (i+ "  ");
					count +=1;
					if(count == 5) {
						count = 0;
						trun = 1;
						System.out.println();
					}
				}
				
			}
			
		}
	}
}
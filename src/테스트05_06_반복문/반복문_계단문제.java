package �׽�Ʈ05_06_�ݺ���;

public class �ݺ���_��ܹ��� {
	public static void main(String[] args) {
		/*
			����� 50 ����� �ִ�. ö���� ���� ����ܿ� ���ִ�. 
			ö���� �ѹ��� �ΰ�ܾ� ��������. 
			ö���� �޹߷� ��� ����� ����Ͻÿ�.
			�Ʒ������� �����Ͻÿ�.
			[1] ö���� �ѹ��� �ΰ�ܾ� ��������.
			[2] ö���� ���ʹߺ��� ��������.
			[3] 5������Ҷ����� �ٸ� ���� ����Ͻÿ�.
			
			48 44 40 36 32 
			30 26 22 18 14
			12 8  4
		 */		
		int count = 0;
		int turn = 1;
		int i = 50;
		while(i > 1) {
			if(turn == 1) {
				i-=1;
				if(i%4 == 0) {
					System.out.print (i+ "  ");
					count+=1;
					if(count == 5) {
						count = 0;
						turn = 2;
						System.out.println();
					}
					
				}
			} 
			else if(turn == 2) {
				i-=1;
				if(i%4 == 2) {
					System.out.print (i+ "  ");
					count+=1;
					if(count == 5) {
						count = 0;
						turn = 1;
						System.out.println();
					}
				}
			}
		}
	}
}
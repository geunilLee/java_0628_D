package �׽�Ʈ05_04_����;

public class �ݺ���_ö������2 {
	public static void main(String[] args) {
		/*
			ö���� ���ε��� ��鿩 ������ �Ǿ���.
			ö���� ��� �������� �Ⱦ��ؼ� ��7���� ��6�Ϸ� �ٲٰ� �������� �����ߴ�.
			5��1���� �Ͽ������ϰ��Ҷ�, 
			5��1�Ϻ��� 5��31�ϱ��� ��¥�� ������ ���� ����غ���.
			
			 
			 [����]
			 	1 => ��
			 	2 => ȭ
			 	3 => ��
			 	4 => ��
			 	5 => ��
			 	6 => ��
			 	7 => ��
			 	8 => ȭ
			 	.......
		 */
		int week = 0;
		for(int i = 1; i <= 31; i++ ) {
			week +=1;
			
			if(week%6 == 0) {				
				System.out.println(week+" => ��");
			}
			if(week%6 == 1) {				
				System.out.println(week+" => ��");
			}
			if(week%6 == 2) {				
				System.out.println(week+" => ȭ");
			}
			if(week%6 == 3) {				
				System.out.println(week+" => ��");
			}
			if(week%6 == 4) {				
				System.out.println(week+" => ��");
			}
			
			
		}
		
	}
}
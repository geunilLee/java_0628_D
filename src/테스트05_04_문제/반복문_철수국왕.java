package �׽�Ʈ05_04_����;

public class �ݺ���_ö������ {
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
		int count = 0;
		int number = 0;
		for(int i = 1; i<=31; i ++) {
			//System.out.println(i);
			count += 1;
			number+=1;
			if(count == 1) {
				System.out.println(i + "��" + " �Ͽ���");
			}
			else if(count == 2) {
				System.out.println(i + "��" + " ȭ����");				
			}
			else if(count == 3) {
				System.out.println(i + "��" + " ������");				
			}
			else if(count == 4) {
				System.out.println(i + "��" + " �����");				
			}
			else if(count == 5) {
				System.out.println(i + "��" + " �ݿ���");				
			}
			else if(count == 6) {
				System.out.println(i + "��" + " �����");				
			}
			else if(count == 7) {
				System.out.println(i + "��" + " �Ͽ���");				
			}
			
		}
		//System.out.println(number);
	}
}
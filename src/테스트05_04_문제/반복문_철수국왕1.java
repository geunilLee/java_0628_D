package �׽�Ʈ05_04_����;

public class �ݺ���_ö������1 {
	public static void main(String[] args) {
		/*
		 * ö���� ���ε��� ��鿩 ������ �Ǿ���. ö���� ��� �������� �Ⱦ��ؼ� ��7���� ��6�Ϸ� �ٲٰ� �������� �����ߴ�. 5��1����
		 * �Ͽ������ϰ��Ҷ�, 5��1�Ϻ��� 5��31�ϱ��� ��¥�� ������ ���� ����غ���.
		 * 
		 * 
		 * [����] 1 => �� 2 => ȭ 3 => �� 4 => �� 5 => �� 6 => �� 7 => �� 8 => ȭ .......
		 */

		int a = 0;
		int week = 0;
		int i = 1;
		while (i <= 31) {
//			System.out.println(i);
	//		System.out.println(i + "��");

			a += 1;
			while(true) {
				if (a % 6 == 0) {
				week = a;

				if (week == 1) {
					
					System.out.println(i +" => �� ");
				}
				if (week == 2) {
					System.out.println(i +" => ȭ ");
				}
				if (week == 3) {
					System.out.println(i +" => �� ");
				}
				if (week == 4) {
					System.out.println(i +" => �� ");
				}
				if (week == 5) {
					System.out.println(i +" => �� ");
				}
				if (week == 6) {
					System.out.println(i +" => �� ");
				}
				if (week == 7) {
					System.out.println(i +" => �� ");
				}
				if(i >= 31) {
				
					
			}
				a+=1;
				
			}
			
		}

	}
}}
package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {
	/*
	 [����]
	 
		ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
		������ 15km , �ö��� �ü�12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
		�������� x , y �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {		
	
	
		double ������1 = 15/60.0;
		double ������2 = 12/60.0;
		
		int �ѽð� = 45;
		int b = �ѽð�;
		int c = 0;
		
			
		int run = 1;
		while(run == 1) {
			if(������1 * b == ������2 * c && b + c == �ѽð�) {
				System.out.println(b + " " + c);
				System.out.println("�Ÿ� : " + ������1 * b);
                run = 0;
			}
			b -= 1;
			c += 1;
		}

	}
}
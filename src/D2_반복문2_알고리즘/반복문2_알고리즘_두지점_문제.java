package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {
	/*
	 * [����]
		ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
		������ �ü�15km , �ö��� �ü�12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
		�������� x , y �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {
		double x = 15/60.0;
		double y = 12/60.0;
		
		int t = 45;
		
		int a = t;
		int b = 0;
		
		int run = 1;
		while (run == 1) {
			if(x*a == y*b && a+b == t) {
				System.out.println("a �ð� : " + a);
				System.out.println("b �ð� : " + b);
				System.out.println("x �Ÿ� : " + x*a);
				System.out.println("y �Ÿ� : " + y*b);
				run = 0;
			}
			a-=1;
			b+=1;
		}
	}
}
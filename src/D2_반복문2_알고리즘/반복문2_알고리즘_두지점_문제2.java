package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_����2 {
	/*
	 * [����]
		ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
		������ �ü� 15km , �ö��� �ü� 12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
		�������� x , y �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {
		double x = 15/60.0;
		double y = 12/60.0;
		int t = 45;
		int a = t;
		int b = 0; 
		int run = 1;
		while(run == 1) {
			if(x*a == y*b && a+b == t) {
				
				System.out.println(x*a + " " + y*b);
			}
			a--;// �ð��ȿ� �Ÿ��� �ð��� ���� ���� ã�´�
			b++;
		}
		
	}
}

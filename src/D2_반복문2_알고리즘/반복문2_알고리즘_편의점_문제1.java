package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_����1 {
	/*
	 * [����]
		ö���� �������� �Ѱ��� 1000���� ������� �Ѱ��� 1200���� ���ڿ����� � �缭 
		�� 15���� ������ ���.
		20000���� ���� 4200���� �Ž����޾����� ö������ ������� ��ΰ���??
	 */	
	public static void main(String[] args) {
		
		
		
		/*
		 ����� = 1000;
		 ���ڿ��� = 1200;
		 a+b=15
		 a*c+b*d = 15800;
		 
		 
		 */	
		
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		int total = 15;
		
		
		int c = total;
		int d = 0;
		
		int run = 1;
		while(run == 1) {
			if(white*c + choco*d == money && c+d == total ) {
				System.out.println("�� ���� ���� : " + white);
				System.out.println("�� ���� ���� : " + c);
				System.out.println("���� ���� ���� : " + d);
				System.out.println("ö���� �� �� ���� ���� : " + white*c);
				break;
			}			
			c-=1;
			d+=1;
		}
	}
}
package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {
	/*
	 * [����]
		ö���� �������� �Ѱ��� 1000���� ������� �Ѱ��� 1200���� ���ڿ����� � �缭 
		�� 15���� ������ ���.
		20000���� ���� 4200���� �Ž����޾����� ö������ ������� ��ΰ���??
	 */	
	public static void main(String[] args) {
		int w = 1000;
		int c = 1200;
		int �ѿ�� = 20000-4200;
		
		int max = 15;
		int a = max;
		int b = 0;
		
		
		int run = 1;
		while(run == 1) {
			if(w*a + c*b == �ѿ�� && a+b == max){
				System.out.println("������ : " + a);
				System.out.println("���ڿ��� : " + b);
				run = 0;
			}
			a-=1;
			b+=1;
		}
		
		
	}
}
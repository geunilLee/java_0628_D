package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_�_���� {
	/*
	 * [����]
	 * ö���� ���� 6�ÿ� 30�п�  ������ 3km ������ ������ ���µ�,
	 * ó������ �ü� 3km�� �ȴٰ� ���߿� �ü� 6km�� �޷�����.
	 * ö���� ������ 7��  10�� �������ߴ�.
	 * �ɾ �Ÿ��� �޷��� �Ÿ��� ���Ͻÿ�.

         �Ǽ��� ��Ȯ�ϰ� ����� �ȵɼ��� �ֱ⶧���� �ּ����θ� Ǫ�ÿ�.
         /*
          
              
              
              
          */
         

	public static void main(String[] args) {
		double x = 3/60.0;
		double y = 6/60.0;
		
		int �ð� = 40;
		int �Ÿ� = 3;
		
		int a = �ð�;
		int b = 0;
		int run = 1;
		while(run == 1) {
			if(x*a + y*b == �Ÿ� && a+b == �ð�) {
				System.out.println(a);
				System.out.println(b);
				System.out.println("�ü�3 : " + a*x);
				System.out.println("�ü�6 : " + b*y);
				run = 0;
				
			}
			
			a-=1;
			b+=1;
			
			
		}
	}
}
package �׽�Ʈ05_02_����;
/*  
	[����]
		ö���� �����ŷ� ����ѹ������µ� 70��, �μ��� 90�ʰ� �ɸ���. 
	    30�е��� ����� ���� ��������� �ٽ� ������ Ƚ���� ������� ���Ͻÿ�.
	[����]
		�ٽ� ������ Ƚ�� : 2
*/
public class �ݺ���6_����08_��� {
	public static void main(String[] args) {
		
		
		int count = 0;
		int t = 1800;
		int a = 70;
		int b = 90;
		
		for(int i = 1; i <= 1800; i++) {
			
			if(i%a == 0 && i%b == 0) {
				System.out.println(i);
				count +=1;
			}
		}
		System.out.println("�ٽ� ����Ƚ�� : " + count);
	}	
}
package �׽�Ʈ05_02_����;
/*  
	[����]
		ö���� �����ŷ� ����ѹ������µ� 70��, �μ��� 90�ʰ� �ɸ���. 
	    30�е��� ����� ���� ��������� �ٽ� ������ Ƚ���� ������� ���Ͻÿ�.
	[����]
		�ٽ� ������ Ƚ�� : 2
*/
public class �ݺ���6_����08_���1 {
	public static void main(String[] args) {
		
		int t = 1800;
		int count = 0;
		
		int i = 1;
		while(i <= 1800) {
			if(i%70 == 0 && i%90 == 0) {
				//System.out.println(i);
				count +=1;
			}
			i +=1;
		}
		System.out.println("�ٽ� ����Ƚ�� : "+ count);
	}	
}
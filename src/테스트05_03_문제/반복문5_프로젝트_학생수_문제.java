package �׽�Ʈ05_03_����;

public class �ݺ���5_������Ʈ_�л���_���� {
	
	/*  
	  [����]
		   a���б� 1�г� �����ϴ� �л����� 8�� 12�� 18�ٷ� ������ �׻� 5���� ������,
		   1�г� ��ü �л����� ���Ͽ���.
		   (�л����� 200���̻� 250��̸�)
	 
	 */
	public static void main(String[] args) {
		int i = 1;
		int a = 8;
		int b = 12;
		int c = 18;
		int d = 0;
		while(i<=250) {
			if(i%a == 5 && i%b == 5 && i%c == 5) {
				//System.out.println(i);
				if(d<i) {
					d = i;
					
				}
			}
			
			
			
			i+=1;
		}
		System.out.println(d);
	}
	
}
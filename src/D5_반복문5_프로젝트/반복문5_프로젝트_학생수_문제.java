package D5_�ݺ���5_������Ʈ;

public class �ݺ���5_������Ʈ_�л���_���� {
	
	/*  
	  [����]
		   a���б� 1�г� �����ϴ� �л����� 8�� 12�� 18�ٷ� ������ �׻� 5���� ������,
		   1�г� ��ü �л����� ���Ͽ���.
		   (�л����� 200���̻� 250��̸�)
	 
	 */
	public static void main(String[] args) {
		int l = 8;
		int l1 = 12;
		int l2 = 18;
		int a = 200;
		
		
		
		while(true) {
			if(a%l == 5 && a%l1 == 5 && a%l2 == 5) {
				System.out.println(a);
				break;
			}
			a+=1;
		}
		
	}
	
}
package D5_�ݺ���5_������Ʈ;

public class �ݺ���5_������Ʈ_�л���_����2 {
	
	/*  
	  [����]
		   a���б� 1�г� �����ϴ� �л����� 8�� 12�� 18�ٷ� ������ �׻� 5���� ������,
		   1�г� ��ü �л����� ���Ͽ���.
		   (�л����� 200���̻� 250��̸�)
	 
	 */
	public static void main(String[] args) {
		
		int num = 8;
		int num2 = 12;
		int num3 = 18;
		int ������ = 5;
		int student = 200;
	
		
		while(true) {
			if(student%num == ������ || student%num2 == ������ || student%num3 == ������) {
				System.out.println(student);
				break;
			}
			
			student += 1;
			
		}
	}
	
}
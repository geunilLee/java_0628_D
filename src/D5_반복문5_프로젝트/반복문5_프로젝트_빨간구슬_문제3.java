package D5_�ݺ���5_������Ʈ;

public class �ݺ���5_������Ʈ_��������_����3 {
	/*
	 * [����]
	  
	    �Ķ����� 50���� ���� ���� 70���� �ִ��� ���� �л��鿡�� �Ȱ��� �������ٷ����Ѵ�.
		�Ķ������� 5�������� 
		���������� 2���� �����Ҷ�, ���������� ���Ͽ���.
		1) �л����� ���ΰ���?
		2) �л��� �ްԵǴ� ���������� ������ ���Ͽ��� .
	 */
		
	public static void main(String[] args) {
		int i = 1;
		int a = 50;
		int b = 70;
		while(true) {
			if(a%i == 5 && (b+2)%i == 0) {
			System.out.println(i);
			break;
			}		
			
		i+=1;
		}	
		System.out.println("�л��� : " + i);
		System.out.println(b/i + "��");
	}
}
package D1_�ݺ���1_�˰���;

public class �ݺ���1_�򰡹���_���2_���� {
	/*
	 * [����]
	 *  18�� ����� ���� ���ϱ�  21�� ����� ������ ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		int i = 1;
		int run = 1;
		int c1 = 0;
		int c2 = 0;
		int num1 = 18;
		int num2 = 21;
		while(run == 1) {
			if(num1%i == 0) {
				c1+=1;
				//System.out.println("c1 : " + c1);
			}
			if(num2%i == 0) {
				c2+=1;
				//System.out.println("c2 : " + c2);
			}
			if(i > 21) {
				run = 0;
			}
			i+=1;
		}
		System.out.println("18 ��� : " + c1 +" "+ "21 ��� : "+c2);
	}
}
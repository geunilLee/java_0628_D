package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�⺻�̷�3_�⺻����3 {
	/*
	 
	 [����1] 1~10���� �߿��� 3�̸� 7�̻��� ���� ����Ͻÿ�.
	       1 + 2 + 7 + 8 + 9 + 10
	 [����1] 37


	 [����2] 1~10���� �߿��� 3�̸� 7�̻��� ������ ����Ͻÿ�. 
			 1,2,7,8,9,10 ==> 6�� 
	 [����2] 6
	 
	*/
	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		while(i <= 10) {
			if(i<3 || 7<=i) {
				//System.out.println(i);
				a = a+i;
				
			}			
			i+=1;			
		}
		System.out.println(a);
		System.out.println();
		
		i = 1;
		int count = 0;
		while(i <= 10) {
			if(i<3 || i>=7) {
				//System.out.println(i);
				count +=1;
			}
			i+=1;
		}
		System.out.println(count);
	}
}
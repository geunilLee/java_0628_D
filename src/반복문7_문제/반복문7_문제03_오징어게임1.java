package �ݺ���7_����;

import java.util.Random;
/*
	[��¡�����]
		ö���� ��¡����ӿ� �����Ͽ���.
		ù��° ������ "����ȭ���� �Ǿ����ϴ�" �̴�.
		��Ģ�� �Ʒ��Ͱ���.	
	[��Ģ]	
		[1] ��ü �Ÿ��� 0 ~ 25���� �Ÿ��� �ִ�.
		[2] ö���� ���� 0�� �ڸ��� �ִ�.
		[3] ö���� ���� 1 ~ 4�� �������ڸ��̴´�. ���ڸ�ŭ �̵��Ѵ�. 
		[4]	�̵��Ÿ��� �����ϸ�, ���� 25�̻��̵Ǹ� �¸��̸� �����Ѵ�.
		[5] ������ ���� 3 ~ 5�� �������ڸ��̴´�. 
		[6] �������� ū ���ڰ������� �����ΰ����� ���ֵǾ� �й��ϸ� �����Ѵ�.
		[7] 10�Ͼȿ� �������ϸ� �ð��ʰ��� �й��ϸ� �����Ѵ�.
		[8] ö���� �̵���� �� ������ ���ڸ� ���� ����Ͻÿ�.
 */
public class �ݺ���7_����03_��¡�����1 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int i = 1;
		int a = 0;
		int b = 0;
		int max = 25;
		while (true) {
			int ö�� = ran.nextInt(4)+1;
			int ���� = ran.nextInt(3)+3;
			a += ö��;
			b += ����;
			System.out.print (i+"��"+"  " +"ö�� �̵��Ÿ� : "+ö�� + "    ");
			System.out.println("ö�� ������ġ : " + a + "    ");
			System.out.print (i+"��"+"  "+"���� �̵��Ÿ� : "+����);
			System.out.println("    "+"���� ������ġ : " + b);
			
			if(ö�� > ����) {
				System.out.println("ö�� : "+ö��);
				System.out.println("���� : "+����);
				System.out.println("ö���� �������� �й�!!");
				break;
			}			
			else if(a>=25) {
				System.out.println("ö�� �¸�!!    ö�� ��ġ��?"+ a);
				break;
			}
			else if(b>=25){
				System.out.println("���� �¸�!!    ������ġ��?" + b);
				break;
			}
			
			if(i == 10) {
				System.out.println(i);
				System.out.println("�ð��ʰ� �й�");
				break;
				}
			i+=1;
	}
		//System.out.println(a);
		//System.out.println(b);
}
}
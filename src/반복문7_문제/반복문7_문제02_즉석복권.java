package �ݺ���7_����;

import java.util.Random;

/*
	[�Ｎ����]
		�������� 1�Ǵ� 7 �� 7������Ѵ�. 
		7�� �������� 3���̻��̸� "��÷" �ƴϸ� "��" ����Ͻÿ�.
	[����]
		7 7 1 1 1 7 1 : ��
		1 7 7 7 1 1 7 : ��÷
*/
public class �ݺ���7_����02_�Ｎ���� {
	public static void main(String[] args) {
		Random ran = new Random();
		int count =0;
		boolean check = false;  
		for(int i = 1; i<= 7; i++) {
			int r = ran.nextInt(2)+1;
			int a = 1;
			int b = 2;
			//System.out.println(r);
			if(a == r) {
				System.out.println("1");
				count = 0;
			}else if(b == r){
				System.out.println("7");
				count +=1;
			}if(count == 3) {
				check = true;
		}
			
		}
		if(check == true) {
			System.out.println("��÷");
		}
		else{
			System.out.println("��");
		}
		
	} 
}
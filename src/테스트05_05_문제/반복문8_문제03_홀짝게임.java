package �׽�Ʈ05_05_����;

import java.util.Random;
import java.util.Scanner;

/*
	[Ȧ¦����]		  
		[1] 1~10������ ���ڸ� �������� �����Ѵ�.
	  	[2] �Է��� "Ȧ"�̸� 1  , "¦"�̸�2 �� �Է��Ѵ�.  �������ڸ� ���纸����. [1.Ȧ] [2.¦] 
	  	[3] Ȧ¦�� ���ߴ°����̴�. 
	  	[4] �⺻���� 3000���� ����������Ѵ�. ������ ���߸� 500�� �̵��� ����,Ʋ���� 1000�� ���ظ� ����.
	  	[5] �Ű����� ���������� ������ ������� �������� �����Ѵ�.  
	  	[6] ���������� �����ڱ��� ����Ͻÿ�.
        [7] ���̾����� ��������ȴ�. 
        [8] ġƮŰ�� -100�� �Է��ϸ� ������ �����ش�. 
*/
public class �ݺ���8_����03_Ȧ¦���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		int count = 3000;
		while(true) {
			if(count <= 0) {
			System.out.println("�ܾ׺���" + count+ " ��");
			break;
			}
			
			int r = ran.nextInt(10)+1;			
			System.out.println("[1.Ȧ] [2.¦]");
			int sel = scan.nextInt();
						
			if(sel == 1 && r%2 != 0) {
				System.out.println("����");
				count+=500;
			}			
			else if(sel == 2 && r%2 == 0) {
				System.out.println("����");				
			}			
			else if(sel == -100) {
				System.out.println(r);
				System.out.println("�����Է�");
				int sel3 = scan.nextInt();
				
				if(sel3 == 1 && r%2 != 0) {
					System.out.println("����");
				}
				else if(sel3 == 2 && r%2 == 0) {
					System.out.println("����");					
				}
				else {
					System.out.println("����");
					count-=1000;			
				}
				
			}
			else {
				System.out.println("����");
				count-=1000;
			
			}
			System.out.println("[1.���] [2.����]");	
			int sel2 = scan.nextInt();
			
			if(sel2 == 1){
			}
			else if(sel2 == 2) {
				System.out.println("����");
				System.out.println("�ܿ��ݾ� " + count);
				break;
			}
		}
		
		

	}
}
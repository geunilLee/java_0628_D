package D3_�ݺ���3_�˰���;

import java.util.Scanner;

public class �ݺ���3_�˰���_�ִ밪_���� {
	/*
	 * 	[�ִ밪 ���ϱ�]
	 * 1. �ݺ����ȿ��� ����ؼ� ���� �Է¹޴´�. ( -1000 ����ū�����Է¹޴´�.)
	 * 2. �Է¹��������� ����ū���ڸ� ����Ѵ�.
	 * 3. -1000 ���� ���ϸ�  �Է��ϸ� �����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int a = 0;
		
		int run = 1;
		while(run == 1) { 
			System.out.println("�����Է�");
			int sel = scan.nextInt();
			if(a<sel) {
				a = sel;
			}		
			if(sel <= -1000) {
				System.out.println("����");
				run = 0;
			}
		}
		System.out.println(a);
		}
		
	}



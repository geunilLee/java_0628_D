package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY1 {
	/*
	 * [Ű��ġ ã��]
	 * 
	 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
	 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
	 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
	 * 
	 * ��) 
	 * result �� �Է� : 99
	 * 
	 * �Է� : 10
	 * �Է� : 99
	 * �Է� : 20
	 * �Է� : 99
	 * �Է� : 30
	 * �Է� : 99
	 * �Է� : 10
	 * �Է� : -1
	 * 
	 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int result = 99;
        

		
        
        // ����� �� ==> -1 ==> "not found"
        // ����� �� ==> 99, 77, -1 ==> Ű�� 1���̴�. 
        // ����� �� ==> 55, 99, 99, 99, 99, 3, -1 ==> Ű�� 2���̴�.
		
		
		int i = 0;
		int number = 0;
		boolean check = false;
		while(true) {
			System.out.print("key�� �Է� : ");
			int key = scan.nextInt();
			
			if(key == -1) {
				break;
			}
			else if(key == result && check == false) {
				check = true;
				number = i;
			}
			i+=1;
		
			
			if(check == false) {
				System.out.println("not found");
			}
			else{
				System.out.println(number);
			}
		}	
			
			
		
		

	}

}
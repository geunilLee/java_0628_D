package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY5 {
	/*
	 * [Ű��ġ ã��]
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
	 * 
	 *  1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
	 *               scan == -1 break;
	 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *               key �� ���ö����� ī��Ʈ �ϰ� Ű�� ������ (ī���Ϳ� ���� ���) key ���� number
	 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
	 *                a<r  a=r  (= ����)
	 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
	 *                sel i= key
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int result = 99;        

		System.out.print("key�� �Է� : ");
		int key = scan.nextInt();
        
        // ����� �� ==> -1 ==> "not found"
        // ����� �� ==> 99, 77, -1 ==> Ű�� 1���̴�. 
        // ����� �� ==> 55, 99, 99, 99, 99, 3, -1 ==> Ű�� 2���̴�.
		//int count = 0;
		int number = 1;
		while(true) {
			
			
			int sel = scan.nextInt();
			
			if(sel == -1) {
				System.out.println(number+" ��°");
				break;				
			}
			else if(sel == 99) {
				
			}
			number +=1;
		}
		

	}

}
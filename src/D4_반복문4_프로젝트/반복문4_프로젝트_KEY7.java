package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY7 {
	/*
	 * [Ű��ġ ã��]
	 * 
	 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�. while true
	 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �� ���� üũ�ؼ� ��° i�� ����
	 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�. üũ�ؼ� ������ ���� ������ �ٲ�
	 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�. üũ�ؼ� Ű�� ������ ã������
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
		boolean check = false;
		int i = 1;
		int a = 0;
		while(true) {
			System.out.print("key�� �Է� : ");
			int key = scan.nextInt();
			
			if(key == -1 && check == false) {
				System.out.println("not found");
				break;
			}
			else if(key == -1) {
				System.out.println(a);
				break;
			}
			if(key == result && check == false){
				check = true; a=i;
			}
			i+=1;
		}
		
		
		

	}

}
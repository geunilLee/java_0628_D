package �׽�Ʈ05_06_�ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �ݺ�������3 {
	public static void main(String[] args) {
		  /*
	        �������� (1~9) ������ ����  8���� ����Ѵ�. 
	        �� �Ʒ��� ������ �����Ѵ�. 
	        
	        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
	        �Ʒ��� ���� ����Ѵ�. 
	        
	        [���]
	           4 5 6
	           5 6 1
	           6 1 2
	           1 2 3
	           2 3 4
	           3 4 5 
        
      */
		int arr[] = {4, 5, 6, 1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length-2; i++) {
			if(arr[i] == 4) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));				
			}
			else if(arr[i] == 5) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 6) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 1) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 2) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 3) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 4) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
			else if(arr[i] == 5) {
				System.out.println(arr[i] +" "+(arr[i+1])+" "+(arr[i+2]));
			}
		}	
			
	
		
		
	}
}

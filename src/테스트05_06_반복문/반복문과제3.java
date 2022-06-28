package 테스트05_06_반복문;

import java.util.Arrays;
import java.util.Random;

public class 반복문과제3 {
	public static void main(String[] args) {
		  /*
	        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
	        단 아래의 조건을 참고한다. 
	        
	        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
	        아래와 같이 출력한다. 
	        
	        [출력]
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

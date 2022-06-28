package 반복문7_문제;

import java.util.Random;

/*
	[즉석복권]
		랜덤으로 1또는 7 을 7번출력한다. 
		7이 연속으로 3번이상이면 "당첨" 아니면 "꽝" 출력하시오.
	[예시]
		7 7 1 1 1 7 1 : 꽝
		1 7 7 7 1 1 7 : 당첨
*/
public class 반복문7_문제02_즉석복권 {
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
			System.out.println("당첨");
		}
		else{
			System.out.println("꽝");
		}
		
	} 
}
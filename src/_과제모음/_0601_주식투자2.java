
package _과제모음;

import java.util.Random;

public class _0601_주식투자2 {
	public static void main(String[] args) {
		/*
			철수는 요즘 주식에 관심을 보이기 시작했다. 
			주식의 상승곡선이 궁금하기 시작했다. 
			최근 관심있는 게임주식을 살펴보기로 했다.
			꾸준히 상승하는 기간중 가장 긴 기간을 출력해보자. 
		 	[1] 랜덤으로 1~8까지 숫자 10개를 순차적으로 출력한다. 
		  	[2] 랜덤숫자는 주가 수치를 뜻하고  숫자가크면 상승 낮으면 하락이다. 
		  	[예시] 아래와같이 랜덤숫자가 나왔다고하면
		  		4 8 3 2 6 7 4 5 6 1
		  		
		  		(1) 처음 4 - 8 은 상승이고 8 다음은 3 이기때문에 최대 상승기간은 1이다.
		  		(2) 다시 2 - 6 - 7 은 상승이고 7다음은 4이기 때문에 최대상승기간은 2이다. 
		  		(3) 4 - 5 - 6 은 상승이고  6 다음 1이기때문에 최대상승기간은 2이다. 
		  		(4) 같은 수치가 연속이면 상승으로 치지않는다.    
		  	[정답]
		  		2일
		 */
		Random ran = new Random();
		int a = 1;
		int number = 0;
		int b = 0;
		int count = 0;
		boolean check = false;
		for(int i = 1; i<=10; i++) {
			int r = ran.nextInt(8)+1;
			System.out.println("램덤숫자 : " + r);
			if(a < r && check == true) {
				System.out.println("주식   : " + r);
				
				count+=1;
				if(b<count){
					b = count;
				}
				System.out.println("카운트  : " + count);
				System.out.println("-----------------");
			}
			else if(a>=r && check == true) {
				System.out.println("주식   : " + r);
				
				count = 0;
				System.out.println("카운트  : " + count);
				System.out.println("-----------------");				
			}
			a=r;
			check = true;		
		}
		System.out.println(" 최종카운트 : " + b);
		
	}
}	
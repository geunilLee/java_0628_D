package 테스트05_05_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[홀짝게임]		  
		[1] 1~10사이의 숫자를 랜덤으로 저장한다.
	  	[2] 입력을 "홀"이면 1  , "짝"이면2 을 입력한다.  랜덤숫자를 맞춰보세요. [1.홀] [2.짝] 
	  	[3] 홀짝을 맞추는게임이다. 
	  	[4] 기본금은 3000원을 가지고시작한다. 정답을 맞추면 500원 이득을 보고,틀리면 1000원 손해를 본다.
	  	[5] 매게임이 끝날때마다 게임을 계속할지 종료할지 선택한다.  
	  	[6] 게임종료후 남은자금을 출력하시오.
        [7] 돈이없으면 강제종료된다. 
        [8] 치트키는 -100을 입력하면 정답을 보여준다. 
*/
public class 반복문8_문제03_홀짝게임 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		int count = 3000;
		while(true) {
			if(count <= 0) {
			System.out.println("잔액부족" + count+ " 원");
			break;
			}
			
			int r = ran.nextInt(10)+1;			
			System.out.println("[1.홀] [2.짝]");
			int sel = scan.nextInt();
						
			if(sel == 1 && r%2 != 0) {
				System.out.println("정답");
				count+=500;
			}			
			else if(sel == 2 && r%2 == 0) {
				System.out.println("정답");				
			}			
			else if(sel == -100) {
				System.out.println(r);
				System.out.println("정답입력");
				int sel3 = scan.nextInt();
				
				if(sel3 == 1 && r%2 != 0) {
					System.out.println("정답");
				}
				else if(sel3 == 2 && r%2 == 0) {
					System.out.println("정답");					
				}
				else {
					System.out.println("오답");
					count-=1000;			
				}
				
			}
			else {
				System.out.println("오답");
				count-=1000;
			
			}
			System.out.println("[1.계속] [2.종료]");	
			int sel2 = scan.nextInt();
			
			if(sel2 == 1){
			}
			else if(sel2 == 2) {
				System.out.println("종료");
				System.out.println("잔여금액 " + count);
				break;
			}
		}
		
		

	}
}
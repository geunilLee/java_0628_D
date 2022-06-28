package 테스트05_05_문제;

import java.util.Random;

/* 
	[문제]
	[반복가위바위보]	 	
		철수와 민수는 계단에서 가위바위보를 한다. 	 	
		철수와 민수는 각각 0 ~ 2 의 랜덤값을 저장한다.
		0 : 가위 , 1 : 바위 , 2 : 보를 뜻한다.	 
		철수와 민수는 50번째 계단의 위치에서 시작을 한다.
		룰은 다음과 같다.	
		이기면 3칸올라가기, 비기면 2칸올라가기, 지면 1칸올라가기.	 	
		둘중 아무나 100이상 도착하거나 둘사이의 간격이 10이상이면 게임은 종료된다. 
		게임이 종료될때까지 두사람의 이동경로를 출력하시오.
*/
public class 반복문7_개념05_반복가위바위보 {
	public static void main(String[] args) {
		Random ran =new Random();
		int 철수위치 = 50;
		int 민수위치 = 50;
		while(true) {
			int 민수 = ran.nextInt(3);
			int 철수 = ran.nextInt(3);
			 
			int 가위 = 0;
			int 바위 = 1;
			int 보 = 2;
			
			if(철수위치 - 민수위치 > 10) {
				System.out.println("10칸 차이 철수 승리 종료");
				break;
			}
			else if(민수위치 - 철수위치 > 10){
				System.out.println("10칸 차이 민수 승리 종료");
				break;
			}
			
			if(민수 == 가위 && 철수 == 바위) {
				철수위치+=3;
				민수위치+=1;
				
				System.out.println("철수위치 : " + 철수위치 + "민수위치 : "+ 민수위치);
			}
			else if(민수 == 바위 && 철수 == 보) {
				철수위치+=3;
				민수위치+=1;
				System.out.println("철수위치 : " + 철수위치 + "민수위치 : "+ 민수위치);
			}
			else if(민수 == 보 && 철수 == 가위) {
				철수위치+=3;
				민수위치+=1;
				System.out.println("철수위치 : " + 철수위치 + "민수위치 : "+ 민수위치);
			}
			else if(민수 == 철수){
				철수위치+=2;
				민수위치+=2;				
				System.out.println("철수위치 : " + 철수위치 + "민수위치 : "+ 민수위치);
			}
			else{
				철수위치+=1;
				민수위치+=3;				
			}
			
			
			if(철수위치 >= 100) {
				System.out.println(철수위치 +"칸  철수 승리");
				break;
			}
			else if(민수위치 >= 100) {
				System.out.println(민수위치 + "칸  민수 승리");
				break;
			}
						
			
			
		}
		System.out.println("최종 철수위치 : " + 철수위치+ "칸 " + "최종 민수위치 : "+ 민수위치);
	}
}
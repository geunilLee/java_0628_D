package 테스트05_06_반복문;

public class 반복문_계단문제 {
	public static void main(String[] args) {
		/*
			계단이 50 계단이 있다. 철수는 제일 윗계단에 서있다. 
			철수는 한번에 두계단씩 내려간다. 
			철수가 왼발로 디딘 계단을 출력하시오.
			아래조건을 참고하시오.
			[1] 철수는 한번에 두계단씩 내려간다.
			[2] 철수는 왼쪽발부터 내려간다.
			[3] 5번출력할때마다 다른 발을 출력하시오.
			
			48 44 40 36 32 
			30 26 22 18 14
			12 8  4
		 */		
		int count = 0;
		int turn = 1;
		int i = 50;
		while(i > 1) {
			if(turn == 1) {
				i-=1;
				if(i%4 == 0) {
					System.out.print (i+ "  ");
					count+=1;
					if(count == 5) {
						count = 0;
						turn = 2;
						System.out.println();
					}
					
				}
			} 
			else if(turn == 2) {
				i-=1;
				if(i%4 == 2) {
					System.out.print (i+ "  ");
					count+=1;
					if(count == 5) {
						count = 0;
						turn = 1;
						System.out.println();
					}
				}
			}
		}
	}
}
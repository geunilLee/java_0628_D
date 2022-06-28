package 반복문7_문제;

import java.util.Random;

public class 반복문7_문제_묵찌빠1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		int 가위 = 1;
		int 바위 = 2;
		int 보 = 3;

		int a = 0;
		int b = 0;
		int count = 0;
		boolean check = false;

		while (true) {
			int r1 = ran.nextInt(3) + 1;
			int r2 = ran.nextInt(3) + 1;

			if (r1 == 가위 && r2 == 바위) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r2 가위바위보 승리");
				b += 2;
				
			} else if (r1 == 바위 && r2 == 보) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r2 가위바위보 승리");
				b += 2;
				
			} else if (r1 == 보 && r2 == 가위) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r2 가위바위보 승리");
				b += 2;
			}
			
			
			else if (r1 == 바위 && r2 == 가위) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r1 가위바위보 승리");
				a += 2;
				
			}
			else if (r1 == 보 && r2 == 바위) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r1 가위바위보 승리");
				a += 2;
				
			}
			else if (r1 == 가위 && r2 == 보) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("r1 가위바위보 승리");
				a += 2;
				
			}

			
			else if (r1 == r2) {
				System.out.println("가위 바위 보 결과 r1 : " + r1);
				System.out.println("가위 바위 보 결과 r2 : " + r2);
				System.out.println("다시 가위바위보");
				check = true;
				count += 1;
				a = 0;
				b = 0;
				
			}
			//r2

			if (b >= 1) {
				int c = ran.nextInt(3) + 1;
				int d = ran.nextInt(3) + 1;
				if (c == 가위 && d == 가위) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r2  묵찌빠 승리");
					break;
				}
				else if (c == 바위 && d == 바위) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r2 묵찌빠 승리");
					break;

				}
				else if (c == 보 && d == 보) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r2 묵찌빠 승리");
					break;

				}
				else {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r2 묵찌빠 승리 실패 다시 가위바위보");
					check = true;
					count += 1;
					a = 0;
					b = 0;
				}
			}
			//   r1
			else if (a >= 1) {
				int c = ran.nextInt(3) + 1;
				int d = ran.nextInt(3) + 1;
				if (c == 가위 && d == 가위) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r1묵찌빠 승리");
					break;
				}
				else if (c == 바위 && d == 바위) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r1묵찌빠 승리");
					break;
				}
				else if (c == 보 && d == 보) {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r1묵찌빠 승리");
					break;
				}
				else {
					System.out.println("묵찌빠 결과 r1 : " + c);
					System.out.println("묵찌빠 결과 r2 : " + d);
					System.out.println("r1 묵찌빠 승리 실패 다시 가위바위보");
					check = true;
					count += 1;
					a = 0;
					b = 0;
				}

			}

		}
		System.out.println(count + "번 다시 가위바위보");
	}
}

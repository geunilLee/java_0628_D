package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_기타이론6_뒤로가기4 {
	/*
	 * [뒤로가기]
	 *      쇼핑몰메인메뉴에서 남성의류를 선택후
	 *      뒤로가기 누르기전까지 남성의류 페이지를 유지할려고한다.
	 * 		
	 * 1. 남성의류
	 * 		1) 티셔츠
	 * 		2) 바지
	 * 		3) 뒤로가기
	 * 2. 여성의류
	 * 		1) 가디건
	 * 		2) 치마
	 * 		3) 뒤로가기
	 * 3. 종료
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean run = true;// 뒤로가기 하는시점
		while(run) {// 첫번째 반복문
			System.out.println("1. 남성의류");
			System.out.println("2. 여성의류");
			System.out.println("3. 종료");
		
			System.out.println("메뉴를 입력하시오.");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean run2 = true; 
				while(run2) {// 두번째 반복문 
					System.out.println("1) 티셔츠");
					System.out.println("2) 바지");
					System.out.println("3) 뒤로가기");//이상 안내문
				
					System.out.println("메뉴를 입력하시오.");// 안내문 추가
					int sel2 = scan.nextInt();// 3가지중택일
				
					if(sel2 == 1) {
						System.out.println("티셔츠");
					}
					else if(sel2 == 2) {
						System.out.println("바지");
					}
					else if(sel2 == 3) {// 3선택시 뒤로가기
						System.out.println("뒤로가기");
						run2 = false;// 뒤로가기
					}
					
				}
				
			}
			else if(sel == 2) {
			
			}
			else if(sel == 3) {
			System.out.println("종료");
			run = false;
			}
		}
	}

}
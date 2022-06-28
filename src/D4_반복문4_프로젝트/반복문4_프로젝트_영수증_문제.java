package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증_문제 {
	/*
	 * 
	 * [영수증 출력]
	 * 1. 5번 주문을 받는다.
	 * 2. 주문이 끝난 후, 돈을 입력받는다.
	 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
	 * 
	 * 예)
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 3
	 * 총 금액 = 31300원
	 * 현금 입력 : 32000
	 * === 롯데리아 영수증 ===
	 * 1. 불고기 버거 : 2개
	 * 2. 새우    버거 : 2개
	 * 3. 콜         라 : 1개
	 * 4. 총   금   액 : 31300원
	 * 5. 잔         돈 : 700원
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.println("메뉴선택하시오.");
			
		int i = 0;
		while (i<=5) {
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("1.불고기 버거 : " + price1 + "원");
			}
			else if(sel == 2) {
				System.out.println("2.새우    버거 : " + price2 + "원");
			}
			else if(sel == 3) {
				System.out.println("3.콜         라 : " + price3 + "원");
			}
			else {
				System.out.println("오류");
			}
			i+=1;
		}
		
	}

}
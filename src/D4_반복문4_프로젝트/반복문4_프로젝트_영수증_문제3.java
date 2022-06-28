package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증_문제3 {
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
		int money = 0;
		int sel2 = 0;
		int 불고기버거 = 0;
		int 새우버거 = 0;
		int 콜라 = 0;
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");		
		
		
		for(int i = 1; i <=5; i++) {
			
			int sel = scan.nextInt();
			System.out.println("메뉴 선택 : " + sel );
			if(sel == 1) {
				money += price1; 불고기버거+=1;
				
			}
			else if(sel == 2) {
				money += price2; 새우버거+=1;
			}
			else if(sel == 3) {
				money += price3; 콜라+=1;
			}
			System.out.println("총금액 : " + money);
			System.out.println("현금 입력 :");
			sel2 = scan.nextInt();
			if(sel2 < money) {
				System.out.println("잔액부족");
			}
		}
		
		System.out.println("1. 불고기 버거 : " + 불고기버거+"개");
		System.out.println("2. 새우   버거 : " + 새우버거+"개");
		System.out.println("3. 콜    라 : " + 콜라+"개");
		System.out.println("총금액 :  " + money);
		System.out.println("잔돈 : "+(sel2 - money));
	}

}
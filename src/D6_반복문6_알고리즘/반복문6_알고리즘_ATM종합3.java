package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합3 {
	/*
	 * [ATM]
	 *  [뒤로가기] 를 활용해 단계별로 기능을 구현한다. 
	 * 	[회원가입] 은 추후 배열에서 가능하다.
	 * 
	 * 메인화면기능         ==> [1.로그인 0.종료 ]
	 * 1번 로그인 선택시     ==> [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]  
	 * 2번 종료 선택시       ==> [종료] 
	 * -------------------------------------------------
	 * [추가조건] 
	 * [1] 5.정보수정 선택시 ==> 비밀번호를 바꿀수있다.
	 * [2] 0.로그아웃 선택시 ==> 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시나온다.         
	 * [3] 로그인 3번실패시 강제 종료한다. 
	 *
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)
		

		boolean run = true; // 뒤로가기
		while(run == true) {// 반복문 무한반복 
			if(log == -1) {// 이 조건문은 로그아웃인 상태일때 로그인가능하기때문에 상태 확인
				int count = 0;// 3회 이상 로그인 실패시 강제 종료
				System.out.println("[1.로그인 0.종료 ]");
				int sel = scan.nextInt();
				if(sel == 1) {
					
					System.out.println("아이디를 입력하시오.");
					int id = scan.nextInt();
					System.out.println("비밀번호를 입력하시오.");
					int pw = scan.nextInt();
					
					if(id == dbAcc1 && pw == dbPw1) {
						System.out.println(dbAcc1 + "로그인성공");
						log = id;
					}
					else if(id == dbAcc2 && pw == dbPw2) {
						System.out.println(dbAcc2 + "로그인성공");
						log = id;
					}
					else {
						System.out.println("로그인 실패");
						count +=1;
						if(count == 3) {
							System.out.println("3회 연속 실패");
							run = false;
							break;
						}
					}
					if(log != -1) {
						while(true) {
							System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("입금할 금액입력");
								int sel7 = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1+=sel7;
									System.out.println("1111님 현재잔액" + dbMoney1);
								}
								else if(log == dbAcc2) {
									dbMoney2+=sel7;
									System.out.println("2222님 현재잔액" + dbMoney2);
								}
							}
							else if(sel2 == 2) {
								System.out.println("출금할 금액입력"); 
								int sel7 = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1 -= sel7;
									System.out.println("1111님 현재잔액" + dbMoney1);
								}
								else if(log == dbAcc2) {
									dbMoney2 -= sel7;
									System.out.println("2222님 현재잔액" + dbMoney2);
								}
								
							}
							else if(sel2 == 3) {
								System.out.println("이체할 계좌번호 입력");
								int sel3 = scan.nextInt();
								if(log == dbAcc1) {
									if(sel3 == dbAcc2) {
										System.out.println("이체할 금액입력");
										int sel4 = scan.nextInt();
										dbMoney1 -= sel4;
										dbMoney2 += sel4;
									}
								}
								else if(log == dbAcc2) {
									if(sel3 == dbAcc1) {
										System.out.println("이체할 금액입력");
										int sel4 = scan.nextInt();
										dbMoney1 += sel4;
										dbMoney2 -= sel4;
									}
								}
								System.out.println("이체완료.");	
							}
							else if(sel2 == 4) {						
									if(log == dbAcc1) {
										System.out.println("현재 잔액 : " + dbMoney1);
									}
									else if(log == dbAcc2) {
										System.out.println("현재 잔액 : " + dbMoney2);
									}
							}
							else if(sel2 == 5) {
								if(log == dbAcc1) {
									System.out.println("변경할 비밀번호 입력");
									 int sel4 = scan.nextInt();
									 dbPw1 = sel4;
									 System.out.println("비밀번호 변경완료");
								}
								else if(log == dbAcc2) {
									System.out.println("변경할 비밀번호 입력");
									 int sel4 = scan.nextInt();
									 dbPw2 = sel4;
									 System.out.println("비밀번호 변경완료");
								}
	
							}
							else if(sel2 == 0) {
								log = -1;
								break;	
							}
						}
						
					}				
				}
				else if(sel == 0) {
					System.out.println("종료");
					break;
				}
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
	


	}

}
package D6_반복문6_알고리즘;
import java.util.Scanner;
public class 반복문6_알고리즘_ATM종합6 {
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
		boolean run = true;
		while(run == true) {
			System.out.println("[1.로그인][0.종료]");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					int count = 0;
					while(true) {
						System.out.println("아이디 입력 : ");
						int id = scan.nextInt();
						System.out.println("비밀번호 입력 : ");
						int pw = scan.nextInt();
						
						if(id == dbAcc1 && pw == dbPw1) {
							log = id;
							System.out.println("로그인성공");
							break;
						}else if(id == dbAcc2 && pw == dbPw2) {
							log = id;
							System.out.println("로그인성공");
							break;
						}else {
							System.out.println("로그인실패 ");
							count += 1;
							System.out.println(count + "번 실패 3번실패시 로그인불가.");
						}
						if(count == 3) {
							run = false;
							break;
						}
					}				
				}	
				if(log != -1) {
					while(true) {
						System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃] ");
						int sel2 = scan.nextInt();
						if(sel2 == 0) {
							log = -1;
							break;
						}else if(sel2 == 1) {
							System.out.println("입금할 금액 입력 : ");
							int money = scan.nextInt();						
							if(log == dbAcc1 ) {
								dbMoney1 += money;
							}else if(log == dbAcc2) {
								dbMoney2 += money;
							}
							System.out.println("입금완료.");
						}else if(sel2 == 2) {
							System.out.println("출금할 금액 입력 : ");
							int money = scan.nextInt();						
							if(log == dbAcc1 ) {
								dbMoney1 -= money;
							}else if(log == dbAcc2) {
								dbMoney2 -= money;
							}						
							System.out.println("출금완료.");
						}else if(sel2 == 3) {
							System.out.println("이체할 계좌번호입력 : ");
							int acc = scan.nextInt();
							System.out.println("이체할 금액입력 : ");
							int money = scan.nextInt();					
							if(acc == dbAcc1 && log == dbAcc2 ) {
								dbMoney2 -= money;
								dbMoney1 += money;
							}else if(acc == dbAcc2 && log == dbAcc1) {
								dbMoney1 -= money;
								dbMoney2 += money;
							}
							System.out.println("이체완료.");
			
						}else if(sel2 == 4) {
							if(log == dbAcc1) {
								System.out.println("조회 : " + dbMoney1);
							}else if(log == dbAcc2) {
								System.out.println("조회 : " + dbMoney2);
							}
						}else if(sel2 == 5) {
							System.out.println("변경할 비밀번호입력 : ");
							int pw = scan.nextInt();
							if(log == dbAcc1) {
								dbPw1 = pw;
							}else if(log == dbAcc2) {
								dbPw2 = pw;
							}
							System.out.println("비밀번호가 수정됩니다.");
						}
					}
				}				
			}else if(sel == 0) {
				break;
			}
		}
	}
}
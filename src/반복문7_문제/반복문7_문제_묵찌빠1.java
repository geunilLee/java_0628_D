package �ݺ���7_����;

import java.util.Random;

public class �ݺ���7_����_�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		int ���� = 1;
		int ���� = 2;
		int �� = 3;

		int a = 0;
		int b = 0;
		int count = 0;
		boolean check = false;

		while (true) {
			int r1 = ran.nextInt(3) + 1;
			int r2 = ran.nextInt(3) + 1;

			if (r1 == ���� && r2 == ����) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r2 ���������� �¸�");
				b += 2;
				
			} else if (r1 == ���� && r2 == ��) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r2 ���������� �¸�");
				b += 2;
				
			} else if (r1 == �� && r2 == ����) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r2 ���������� �¸�");
				b += 2;
			}
			
			
			else if (r1 == ���� && r2 == ����) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r1 ���������� �¸�");
				a += 2;
				
			}
			else if (r1 == �� && r2 == ����) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r1 ���������� �¸�");
				a += 2;
				
			}
			else if (r1 == ���� && r2 == ��) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("r1 ���������� �¸�");
				a += 2;
				
			}

			
			else if (r1 == r2) {
				System.out.println("���� ���� �� ��� r1 : " + r1);
				System.out.println("���� ���� �� ��� r2 : " + r2);
				System.out.println("�ٽ� ����������");
				check = true;
				count += 1;
				a = 0;
				b = 0;
				
			}
			//r2

			if (b >= 1) {
				int c = ran.nextInt(3) + 1;
				int d = ran.nextInt(3) + 1;
				if (c == ���� && d == ����) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r2  ����� �¸�");
					break;
				}
				else if (c == ���� && d == ����) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r2 ����� �¸�");
					break;

				}
				else if (c == �� && d == ��) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r2 ����� �¸�");
					break;

				}
				else {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r2 ����� �¸� ���� �ٽ� ����������");
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
				if (c == ���� && d == ����) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r1����� �¸�");
					break;
				}
				else if (c == ���� && d == ����) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r1����� �¸�");
					break;
				}
				else if (c == �� && d == ��) {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r1����� �¸�");
					break;
				}
				else {
					System.out.println("����� ��� r1 : " + c);
					System.out.println("����� ��� r2 : " + d);
					System.out.println("r1 ����� �¸� ���� �ٽ� ����������");
					check = true;
					count += 1;
					a = 0;
					b = 0;
				}

			}

		}
		System.out.println(count + "�� �ٽ� ����������");
	}
}

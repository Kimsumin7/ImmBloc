package tommy.java.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game { // 절차형 프로그램
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력준비

		int gameCoin = 1000;
		int menu = -1;
		boolean isLoop = true; // 반복 여부

		while (isLoop) {
			System.out.println("이것은 주사위 게임입니다.");
			System.out.println("1.홀수");
			System.out.println("2.짝수");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴선택: ");

			try {
				menu = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				menu = -1;
				System.out.println("입력오류: 메뉴 확인 후 다시 입력");
				System.out.println();
				continue;
			}

			if (menu == 0) {
				System.out.println();
				System.out.print("정말로 게임을 종료하시겠습니까?(y/n): ");
				char result = (char) System.in.read();
				System.in.read();
				System.in.read(); // 엔터값 처리
				if (result == 'Y' || result == 'y') {
					System.out.println("프로그램을 종료합니다."); // 생략가능
					isLoop = false; // break; // System.exit(0);
				} else {
					System.out.println("프로그램 종료를 취소합니다.");
					System.out.println();
				}
				continue;
			}

			if (menu != 1 && menu != 2) {
				System.out.println("메뉴입력오류 - 메뉴를 확인하시고 다시 입력해 주세요");
				System.out.println();
				continue;
			}

			System.out.println();
			System.out.print("배팅금액: ");
			int batMoney = -1;

			try {
				batMoney = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				batMoney = 100;
				System.out.println();
				System.out.println("잘못된 입력으로 배팅값은 기본값으로 처리됩니다.");
			}

			if (batMoney > gameCoin) {
				System.out.println();
				System.out.println("보유한 게임머니보다 큰 금액 배팅 불가능 합니다. \n 배팅금액은 기본값인 100원으로 처리됩니다.");
				batMoney = 100;
			}

			System.out.println();
			System.out.println("주사위를 던지려면 Enter를 치세요.");
			System.in.read();
			System.in.read();// 엔터값 처리

			System.out.println();
			int dice = (int) (Math.random() * 6) + 1;

			System.out.println("주사위 값: " + dice);
			// 6개라 나오는 경우의 수가 뻔함, 더했을때 홀수가 되면 짐
			if ((menu + dice) % 2 == 0) { // 내가 이기는 경우
				System.out.println("You Win!");
				gameCoin += batMoney;
			} else { // 내가 지는 상황
				System.out.println("You Loose!");
				gameCoin -= batMoney;
			}
			System.out.println("게임머니: " + gameCoin);
			System.out.println();

			if (gameCoin <= 0) {
				System.out.println("게임머니를 모두 소진하였습니다.");
				isLoop = false; // break;
			}
		} // end while
		System.out.println("게임을 종료합니다.");
	}
}// end main

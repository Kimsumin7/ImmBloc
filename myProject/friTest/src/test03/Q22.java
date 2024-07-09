package test03;

import java.util.Scanner;

/**
 * 금액을 입력받아서 화폐의 개수를 구하는 아래와 같이 프로그램을 작성하세요.
 단 금액은 10원 이상 10만원 미만의 금액만 입력한다. 

 * */
public class Q22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가진 금액 입력 = ");
		int money = scanner.nextInt();
		
		if (money < 10 || money >= 100000) {
			System.out.println("단, 금액은 10원 이상 10만원 미만의 금액만 입력");
		} else {
			int manwon = money/10000;
			money %= 10000;

            int cheonwon = money / 1000; 
            money %= 1000; 

            int baekwon = money / 100; 
            money %= 100; 

            int sipwon = money / 10;
            money %= 10; 

            // 각 화폐 단위의 개수를 출력
            System.out.println("만원 = " + manwon + "장");
            System.out.println("천원 = " + cheonwon + "장");
            System.out.println("백원 = " + baekwon + "개");
            System.out.println("십원 = " + sipwon + "개");
		}
		
		scanner.close();
	}

}

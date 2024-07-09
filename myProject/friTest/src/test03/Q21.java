package test03;

import java.util.Scanner;

/**
 * 초를 입력받아서 분으로 계산하는 프로그램을 아래와 같이 작성해 보세요.
 * */
public class Q21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초 입력 = ");
		int seconds = scanner.nextInt();
		
		int minutes = seconds/60;
		int remainingSeconds = seconds%60;
		
		System.out.println("입력한 " + seconds + "초는 " + minutes +
				"분" + remainingSeconds + "초 입니다.");

	}

}

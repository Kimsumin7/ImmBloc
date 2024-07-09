package test03;

import java.util.Scanner;

/**
 * 밑변과 높이를 입력받아서 삼각형의 넓이를 구하는 프로그램을 작성하세요.
 삼각형의 넓이를 구하는 공식은 [넓이 = 밑변 * 높이 / 2] 이다.

 * */
public class Q20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변 = ");
		int base = scanner.nextInt();
		System.out.print("높이 = ");
		int height = scanner.nextInt();
		
		double area = (base * height)/2;
		System.out.println("삼각형 넓이 = " + area);
		
		scanner.close();
	}

}

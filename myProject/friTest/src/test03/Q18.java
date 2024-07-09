package test03;

import java.util.Scanner;

/** 
 * 국어점수 영어점수 수학점수를 입력받아 총첨과 평균을 출력해주는 프로그램을 작성하세
요.
 * */
public class Q18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 = ");
		String name = scanner.nextLine();
		System.out.print("국어 = ");
		int kor = scanner.nextInt();
		System.out.print("영어 = ");
		int eng = scanner.nextInt();
		System.out.print("수학 = ");
		int math = scanner.nextInt();
		
		int total = kor+eng+math;
		double average = total/3.0;
		
		System.out.printf("%s님의 총점은 %d점이고 평균은 %.2f점입니다.%n", name, total, average);
		
        scanner.close();
	}

}

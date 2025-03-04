package tommy.java.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (args.length == 0) {
			System.out.println("Usage : java ArrayEx3 subject1 subject2 ... ");
			System.exit(0);
		}

		System.out.print("학생 이름 = ");
		String name = br.readLine();

		String[] subject = new String[args.length];
		for (int i = 0; i < subject.length; i++) {
			subject[i] = args[i];
		}

		int jumsu[] = new int[subject.length + 1];
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "과목 점수 = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length - 1] += jumsu[i];
		}

		float avg = jumsu[jumsu.length - 1] / (float) subject.length;
		avg = Math.round(avg * 100) / 100.f;
		char grade = 0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.println();
		System.out.println("*********************** 성 적 표 ********************");
		System.out.print("이름\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t 평균\t 학점");

		System.out.print(name + "\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(jumsu[i] + "\t");
		}
		System.out.print(jumsu[jumsu.length - 1] + "\t");
		System.out.println(avg + "\t" + grade);

		br.close();
	}
}

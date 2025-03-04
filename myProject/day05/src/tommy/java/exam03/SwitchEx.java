package tommy.java.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {
	public static void main(String[] ar) throws IOException {
		int kor;
		int eng;
		int mat;
		float avg;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.print("국어 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 = ");
		mat = Integer.parseInt(br.readLine());
		// avg = (int)((avg + 0.005)*100)/100.f; //소수점 3자리에서 반올림
		avg = (kor + mat + eng) / 3.f;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F입니다.");
			break;
		}
	}

}

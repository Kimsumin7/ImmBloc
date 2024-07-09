package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 =  ");
		String name = reader.readLine();
		System.out.print("국어 = ");
		int kor = Integer.parseInt(reader.readLine());
		System.out.print("영어 = ");
		int eng = Integer.parseInt(reader.readLine());
		System.out.print("수학 = ");
		int math = Integer.parseInt(reader.readLine());
		
		int total;
		
		System.out.println(name + "님의 ");

	}

}

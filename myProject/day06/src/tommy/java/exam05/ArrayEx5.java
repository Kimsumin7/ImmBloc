package tommy.java.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 성적표 - 여러명에 대한 성적표 여러명이 시험을 보는데 대신 과목에 대해서는 자유도를 부여 실행할 때 java ArrayEx5 사람수 국
 * 영 수
 */
public class ArrayEx5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int human = Integer.parseInt(args[0]); // 사람수
		String[] name = new String[human];
		String[] subject = new String[args.length - 1]; // 실제 시험본 것은 3과목

		// 과목수 = subject.length = args.length-1
		for (int i = 0; i < subject.length; i++) {
			subject[i] = args[i + 1]; // 과목명 가져오기
			int[][] jumsu = new int[human][subject.length + 1]; // +1 총점을 저장할 공간
			float[] avg = new float[human];
			char[] grade = new char[human];
			int[] rank = new int[human];
			
			for (int j = 0; j < human; i++) {
				System.out.println(i + 1 + "번 학생이름 = ");
				name[i] = br.readLine();
				
				System.out.println();
				System.out.println(name[i] + "학생의 과목별 점수 입력");
				for (int j = 0; j < subject.length; j++) {
					System.out.println(subject[j] + "점수 = ");
					jumsu[i][j] = Integer.parseInt(br.readLine());
					jumsu[i][jumsu[i].length-1] += jumsu[i][j] //총점계산
					
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
				}
				
			}//end for

			//등수계산
			for(int i=0; i<human; i++) {
				rank[i]++;
				for(int j=0; j<human; j++) {
					if (avg[i] < avg[j]) rank[i]++;
					
				}
			}
			//화면출력
			System.out.println();
			System.out.print("이름\t");
			for(int i=0; i<subject.length;  + "\t") {
				System.out.println(subject[i] + "\t");
				System.out.println("총점\t평균\t학점\t등수");
			}
		}

	}

}

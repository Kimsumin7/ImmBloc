package test03;

import java.io.IOException;

/**
 * 영어 알파벳을 입력받아서 대문자 이면 소문자로 소문자이면 대문자로 바꾸어주는 프로그
램을 작성하세요. (System.in.read()와 if~else 문을 이용할 것)

 * */
public class Q19 {

	public static void main(String[] args) throws IOException{
		System.out.print("알파벳 입력 = ");
		char input = (char)System.in.read();
		
		if (input >= 'A' && input <= 'Z') {
			input = (char)(input + ('a' - 'A'));
			System.out.println("변경된 알파벳은 " + input + "입니다.");
		} else if(input >= 'a' && input <= 'z'){
			input = (char)(input - ('a' - 'A'));
			System.out.println("변경된 알파벳은 " + input + "입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}

}

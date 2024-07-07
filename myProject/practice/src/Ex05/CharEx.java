package Ex05;

public class CharEx {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '\u0041'; // unicode방식
		System.out.println("ch1 + ch2 = " + ch1 + ch2);
		System.out.println("ch1 + ch2 = " + (ch1 + ch2));
		System.out.println("ch1 + ch2 = " + (char) (ch1 + ch2)); // 화면에 표시되지 않는 제어 문자
	}
}

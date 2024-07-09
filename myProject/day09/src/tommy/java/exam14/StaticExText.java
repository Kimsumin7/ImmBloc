package tommy.java.exam14;

class StaticEx {
	int x;
	static int y;
}

public class StaticExText {

	public static void main(String[] args) {
		System.out.println("StaticEx.y = " + StaticEx.y);
		StaticEx.y = 100;
		System.out.println("StaticEx.y = " + StaticEx.y);
		StaticEx se = new StaticEx(); // 지역변수
		System.out.println("se.x = " + se.x);
		System.out.println("se.y = " + se.y);

	}

}

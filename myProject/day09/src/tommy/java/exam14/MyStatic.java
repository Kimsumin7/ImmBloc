package tommy.java.exam14;

public class MyStatic {
	// 멤버필드
	private int x;
	private static int y;

	static { // static 초기화 구문
		y = 10;
	}

	// 성성자
	public MyStatic() {
		x = 5;
		// y = 20; // 이걸로만은 초기화 안됨, 초기화 구문 부분에서 해줘야 함
	}

	// 메서드
	public MyStatic(int x) {
		this();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// 클래스의 멤버 메서드일 경우에는 예외가 안남(static 제거했을때)
	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		MyStatic.y = y;
	}

}

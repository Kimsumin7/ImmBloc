package tommy.java.exam05;

class Test {
	int x;
	int y; // 멤버필드
	// 생성자 : Default 생성자 : public Test(){ }
	// 메서드 : 기능, 동작

	public void setX(int a) {
		x = a;
	}

	public int getX() {
		return x;
	}
}

public class Sample {
	public static void main(String[] args) {
		Test tt = new Test();
		tt.setX(5);
		System.out.println(tt.getX());
		// 자바에서 포함 멤버들이 각각 접근 지정자를 가짐
	}
}

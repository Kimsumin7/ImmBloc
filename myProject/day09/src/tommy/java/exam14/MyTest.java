package tommy.java.exam14;

public class MyTest {
	public static void main(String[] args) {
		MyStatic ms = new MyStatic();
		System.out.println("x = " + ms.getX());
		System.out.println("y = " + MyStatic.getY());
		ms.setX(10);
		MyStatic.setY(20);
		System.out.println("x = " + ms.getX());
		System.out.println("y = " + MyStatic.getY());
		MyStatic ms1 = new MyStatic();
		System.out.println("x = " + ms1.getX());
		System.out.println("y = " + MyStatic.getY());
		System.out.println();
		ms1.setY(50);
		System.out.println("y = " + ms.getY());
		System.out.println("y = " + MyStatic.getY());
		System.out.println("y = " + ms1.getY());

	}
}

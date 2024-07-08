package tommy.java.exam05;

public class ArrayEx08 {
	public static void main(String[] args) {
		String[] src = { "Java", "Database", "JSP", "Spring" };
		String[] des = new String[6];
		des[0] = "Linux";
		des[1] = "Network";
		System.arraycopy(src, 0, des, 2, 4);
		for (String temp : des)
			System.out.println("des value : " + temp);

	}
}

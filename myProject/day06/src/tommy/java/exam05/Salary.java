package tommy.java.exam05;

public class Salary {
	private int pay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {
		if (pass.equals("1234"))
			this.pay = pay;
	}
}

package tommy.java.exam16;

public class Account {
	// 멤버필드
	private String name;
	private long balance;

	// 생성자
	public Account() { // 디폴트 생성자 무조건 만들어 두기

	}

	public Account(String name) { // 실제로 이것만 사용
		super();
		this.name = name;
	}

	// 메서드
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public long getBalance() {
		return balance;
	}

//	public void setBalance(long balance) {
//		this.balance = balance;
//	}

	public void deposit(long amount) {
		balance += amount;
	}

	public void withdraw(long amount) {
		if (balance < amount)
			System.out.println("잔고가 부족합니다");
		else
			balance -= amount;
	}

}

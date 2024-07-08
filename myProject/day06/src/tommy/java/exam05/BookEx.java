package tommy.java.exam05;

public class BookEx {// 클래스명 - 내가 표현한고 싶은 데이터 이름
	// 멤버필드
	String name;
	String writer;
	int price;
	int nowPage;

	// 생성자 - 객체를 생성해주는 역할을 수행함 BookEx myBook = new BookEx();
	public BookEx() { // 생성자 이름은 클래스 이름과 같아야 함

	} // 디폴트 생성자 default constructor 내가 생성자를 하나도 안 만들면 자동으로 JVM이 하나 만들어줌

	// 메서드
	public void nextPage() {
		nowPage++;
	}

	public void previousPage() {
		nowPage++;
	}
}

package javastudy01;

public class Sushi extends Food{
	private String wasabiBrand;

	//매개변수가 있는 생성자만 있다면
	//그리고 그런 생성자가 여러개 있다면
	// 그 생성자 중 하나라도 쓰면 된다.
	// 조상클래스에 매개변수 없는 생성자가 없으므르
	//자손클래스는 무조건 매개변수가 있어야 함
	
	public Sushi(String name) {
		super(name); //super는 Food 클래스의 생성자를 의미한다.	
	}

	public Sushi(String name, int price, String wasabiBrand) {
		super(name, price);
		this.wasabiBrand = wasabiBrand;
	}

	public Sushi(String name, int price) {
		super(name, price);
	}

	public String getWasabiBrand() {
		return wasabiBrand;
	}

	public void setWasabiBrand(String wasabiBrand) {
		this.wasabiBrand = wasabiBrand;
	}
	
	
	
}

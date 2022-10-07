package javastudy01;

public class Food {
	private String name;
	private int price;
	public void eat() {
		System.out.println(name+"을/를 "+price+"원으로 먹음");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Food(String name) {
		super();
		this.name = name;
	}
	
	
	//만약에 음식을 만들 때 반드시 이름과 가격을 꼭 알아야 한다면
	//매개변수 2개 있는 생성자 하나만 만들면 된다.
	
	
	
}

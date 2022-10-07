package 실습;

public class Food {
	private String name;
	private int price;
	
	
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


	public void eat() {
		System.out.println(this.name+"를 "+this.price+"원에 사먹어야지.");
	}
	
	public Food(String n, int p) {
		this.name=n;
		this.price=p;
	}
	public Food() {
		
	}
}

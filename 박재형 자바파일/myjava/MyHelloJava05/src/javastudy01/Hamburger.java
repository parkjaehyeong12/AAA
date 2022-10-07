package javastudy01;

public class Hamburger extends Food {

	public Hamburger(String name, int price) {
		super(name, price);
	}
	
	public void eat() {
		System.out.println(getName()+"햄버거 가격이 "+getPrice()+" 원이라니 싸다~");
	}
	
	public void eat(int n) {
		System.out.println(getName()+"햄버거라면 "+n+" 개라도 먹을 수 있어!");
	}

}

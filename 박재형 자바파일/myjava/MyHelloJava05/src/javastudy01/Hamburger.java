package javastudy01;

public class Hamburger extends Food {

	public Hamburger(String name, int price) {
		super(name, price);
	}
	
	public void eat() {
		System.out.println(getName()+"�ܹ��� ������ "+getPrice()+" ���̶�� �δ�~");
	}
	
	public void eat(int n) {
		System.out.println(getName()+"�ܹ��Ŷ�� "+n+" ���� ���� �� �־�!");
	}

}

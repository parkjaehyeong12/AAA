package javastudy01;

public class FishAndChips extends Food {

	public FishAndChips(String name, int price) {
		super(name, price);
		
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("������ ������ ������~");
	}

}

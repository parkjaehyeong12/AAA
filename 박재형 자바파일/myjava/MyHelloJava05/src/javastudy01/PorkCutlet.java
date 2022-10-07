package javastudy01;

public class PorkCutlet extends Food {

	public PorkCutlet(String name, int price) {
		super(name, price);

	}

	@Override
	// 오버라이드 = 덮어쓰는것 //조상클래스의 같은 이름의 메소드를 불러온다.거기에 덮어쓰는것
	//만약 덮어쓰지 않는다면 자식은 자식의 메서드를 더 우선시한다.
	
	// Food에서의 eat이 아니라 전혀 다른 eat을 만들어 낼 수 있다.
	// 오버로딩과는 다르다. 오버로딩은 매개변수가 다른 같은 이름의 메소드들
	
	public void eat() {
		//	super.eat(); //조상클래스의 eat을 호출하는것.
		System.out.println(getName() + "은 최고의 돈까스");
		System.out.println(getPrice() + "원의 가격이 아깝지 않네");	
	}
	//아래는 오버로딩
	public void eat(int count ) {
		System.out.println(count+"번 돈까스 먹음");
	}
	public void eat (String source) {
		System.out.println(source+"소스에 찍어먹다");
	}
	
	
	
	
}

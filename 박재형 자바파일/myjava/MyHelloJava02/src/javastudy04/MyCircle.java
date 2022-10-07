package javastudy04;

public class MyCircle {
	private int r;
	private final double pi = 3.14;
	
	//final 로 정하면 변하지 않는다.
	
	public int getR() {
		return r;
	}
	//반지름 값이 0이하일 경우 0으로 고정시켜버린다.
	public void setR(int r) {
		if(r<=0)
			this.r=0;
		else;
			this.r = r;
	}
	
	//public타입의 함수를 2개 새로 만든다.
	//넓이 구하기랑 둘레 구하기
	
	public double getArea() {
		if(r<0)
		{
			System.out.println("반지름값 확인 바람");
			return 0;
		}
		return r*r*pi;
	}
	
	public double getRound() {
		if(r<0)
		{
			System.out.println("반지름값 확인 바람");
			return 0;
		}
		return 2*r*pi;
	}
	//생성자 = 리턴값 없는 함수라고도 본다.
	//생성자는 글자그대로 생성할 때 호출하므로
	//변수를 선언함과 동시에 속성값도 바로 세팅할 수 있다.
	//r값을 나중에 별도 세팅해야 하지만
	//이렇게 매개변수로 r값 적으면 선언과 동시에 r값 선언 가능함
	
	public MyCircle (int r) {
		setR(r);		
	}
	
	//이렇게 생성자를 명시적으로 적게 됨녀
	//기존에 있던 생성자가 지워짐
	//원래는 아래에 있던 생성자가 표기되지는 않았지만 내재되어 있었다.
	
	//아무것도 없는 생성자를 명시적으로 써준다.
	public MyCircle() {
		
	}
	
	//오버로딩
	//생성자나 함수 만들 때
	//이름은 똑같은데 매개변수의 개수나 타입이 다른 경우엔
	// 서로 다른 걸로 취급한다.
	//즉 MyCircle(r)과 MyCircle()은 서로 다른 생성자
	
	
	
}

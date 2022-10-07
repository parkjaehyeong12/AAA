package javastudy05_answer;

import javastudy02.Circle;

public class Sphere extends Circle {

	//add constructor sphere
	//constructor: 생성자
	//super : 조상클래스의 생성자 호출한 것
	//KBStudent와는 다르게 이건 생성자가 잇어야 됨
	//Circle에 디폴트 생성자(=아무것도 없는 생성자)가 없기 때문에
	//Circle에 있는 생성자를 호출해야지만 이 객체도 만들 수 있다.
	
	public Sphere(int r) {
		super(r); //Circle 클래스의 생성자를 호출한 것
	}
	
	public double getVolume() {
		return (4.0/3)*getPI()*getR()*getR()*getR();
	}
	//새로운 속성을 추가x 새로운 기능 추가
	
	
	//protected
	//같은 패키지 안에서는 public과 같다.
	//디폴트 접근 제한자랑 마찬가지다.
	//폴더가 달라지면
	//Sphere를 상속받은 클래스에서만 이걸 쓸 수 있다.
	
	protected String Color;
	
	protected void spin() {
		System.out.println("빙글빙글~");
	}

}

package javastudy02;

public class Taco extends Food{

	@Override
	public void eat() {
		System.out.println("감싸서 먹는다. 단");
		System.out.println("고수 빼기");
/*		일반 상속은 생성자(기본생성자 포함) 하나 이상을 오버라이딩하게 되는데
 * 		추상클래스는 부모클래스의 추상화된 함수를 자식클래스에서 구체화시키는 것이다.*/
	}

}

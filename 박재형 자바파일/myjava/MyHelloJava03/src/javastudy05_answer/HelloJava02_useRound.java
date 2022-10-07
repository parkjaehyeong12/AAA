package javastudy05_answer;

import javastudy02.Circle;

public class HelloJava02_useRound {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1 = new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		//참고
		//클래스 변수는 부모, 자식클래스가 공유해서 쓴다.
		//즉 static이 붙은 건 자식클래스든 부모클래스든
		//어디에서 바꾸든지 전부 영향을 받는다.
		
		Circle.setPI(1);
		System.out.println(sp1.getVolume());
		
		Sphere.setPI(0);
		System.out.println(c1.getArea());
		
		
	}

}

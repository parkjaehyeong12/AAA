package javastudy01;

public class HelloJava02_testRectangle {
	public static void main(String args[]) {
		
		Rectangle r1 = new Rectangle(); //w와 h 모두 0
		Rectangle r2 = new Rectangle(2);
		Rectangle r3 = new Rectangle(3,2);
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println(r3.getArea());
		r1.setH(10);
		r1.setW(5);
		System.out.println(r1.getArea());
		
		//new 키워드
		//클래스명(), 클래스명(매개변수들)=>생성자
		//new + 생성자 =>인스턴스
		//인스턴스는 new+생성자 할 때마다 늘어난다.
		//지금 여기선 Rectangle 객체가 3개 있다.
		//그말은 여기 3개의 인스턴스가 있다는 말.
		
		
	}
}

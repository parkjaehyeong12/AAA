package javastudy04;

public class Circle {
	private int r;
	//PI와 같이 모든 클래스가 공통적으로 접근하고
	//공통적으로 쓸 수 있는 변수를 클래스 변수
	//인스턴스별로 다른 게 아니다.	
	private static double PI;

	//공통적으로 쓸 수 있는 메소드를 클래스 메소드
	public static double getPI() {
		return PI;
	}
	//클래스 메소드
	public static void setPI(double pI) {
		PI = pI;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	//매개변수가 있는 생성자를 만들녀서
	//디폴트 생성자느 지워짐
	public Circle(int r) {
		super();
		this.r=r;
		PI=3.14;
	}
	
	public double getArea() {
		return r*r*PI;
	}
	public Circle() {
		
	}
	
}

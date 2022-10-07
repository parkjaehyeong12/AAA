package javastudy06;

public class HelloJava02_playGlobe {
	public static void main(String[] args) {
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("파란색");
		g1.setColor("녹색");
		System.out.println(g1.getColor());
		
		//Color, spin은 protected라서
		//Sphere를 상속한 클래스이거나
		//Sphere와 같은 폴더에 있는 클래스에서만
		//접근이 가능함
		//g1.Color //x
		//g1.spin() //x
		
		//private 자기 클래스 내부만
		//default 자기 패키지
		//protected 자기 패키지 + 상속(받은 다른 패키지의 그 클래스)까지
		//public 모든 패키지, 모든지, 모든
	}
}

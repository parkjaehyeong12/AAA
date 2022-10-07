package javastudy01;

public class HelloJava01_Square {
	public static void main (String args[]) {
		Square s1 = new Square();
		s1.setWh(-1);
		System.out.println(s1.getWh());
		s1.setWh(10);
		System.out.println(s1.getWh());
		
		Square s2 = new Square(-50);
		System.out.println(s2.getWh());
		
	}
}

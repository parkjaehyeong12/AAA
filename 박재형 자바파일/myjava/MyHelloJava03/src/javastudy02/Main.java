package javastudy02;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
//		System.out.println("c1 ������ �Է�");
//		Circle c1 = new Circle(s.nextInt());
//		System.out.println(c1.getArea());
//		
//		System.out.println("c2 ������ �Է�");
//		Circle c2 = new Circle(s.nextInt());
//		System.out.println(c2.getArea());
		
		Circle cc = new Circle(2);
		Circle ccc = new Circle(3);
		
		System.out.println(cc.getArea());
		System.out.println(ccc.getArea());
		
		cc.setPI(5.141592);
		
		System.out.println(cc.getArea());
		System.out.println(ccc.getArea());
		
	}
}

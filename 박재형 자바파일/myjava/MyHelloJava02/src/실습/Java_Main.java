package �ǽ�;

import java.util.Scanner;

public class Java_Main {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���~");
		int wh = s.nextInt();
		Square sq = new Square(wh);
		
		System.out.println("w, h�� �Է��ϼ���");
		int w = s.nextInt();
		int h = s.nextInt();
				
		System.out.println(new Ractangle(w,h).getArea());
		
	}
}

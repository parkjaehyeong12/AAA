package �ǽ�2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("�л�1");
			Student s1 = new Student(s.nextLine(),s.nextInt());
			System.out.println("�л�2");
			Student s2 = new Student(s.nextLine(),s.nextInt());
			System.out.println("�л�3");
			Student s3 = new Student(s.nextLine(),s.nextInt());
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}

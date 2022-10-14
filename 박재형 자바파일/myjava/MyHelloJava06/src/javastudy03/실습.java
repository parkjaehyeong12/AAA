package javastudy03;

import java.util.Scanner;

public class 실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			int num1;
			int num2;
		
		try {
			System.out.println("첫번째 숫자 입력");
//			num1 = Integer.parseInt(s.nextLine());
//			String n1 = s.nextLine();
//			System.out.println("두번째 숫자 입력");
//			num2 = Integer.parseInt(s.nextLine());
			
//			String n2 = s.nextLine();
//			System.out.println(num1*num2);
			
			
//			char f1 = n1.charAt(0);
//			char f2 = n1.charAt(1);
//			char f3 = n1.charAt(2);
//			
//			char s1 = n2.charAt(0);
//			char s2 = n2.charAt(1);
//			char s3 = n2.charAt(2);
//			
//			System.out.println(((f1-48)*100+(f2-48)*10+(f3-48))*(s3-48));
			
			int n1 = Integer.parseInt(s.nextLine());
			String n2 = s.nextLine();
			int n3 = Integer.parseInt(n2);
			
			
			System.out.println(n1*Integer.parseInt(n2.substring(n2.length()-1)));
			System.out.println(n1*Integer.parseInt(n2.substring(n2.length()-2,2)));
			System.out.println(n1*Integer.parseInt(n2.substring(n2.length()-3,1)));
			System.out.println(n1*n3);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			num1 = 0;
			num2 = 0;
			System.out.println("오류났습니다.");
			e.printStackTrace();
		}
			
		
		
	}

}

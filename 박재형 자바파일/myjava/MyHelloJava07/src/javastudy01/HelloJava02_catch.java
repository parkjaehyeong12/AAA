package javastudy01;

import java.util.Scanner;

public class HelloJava02_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch 여러개 달리는 거
		//단 맨 아래에는 Exception이 달려야 함
		//혹은 Exception하고, 그 밑에 Throwable 추가해야 한다.
		
		int a=0, b=0, c=0;
		//try catch를 거는데, 숫자를 잘못입력한 경우
		
		Scanner s = new Scanner(System.in);
		
		try {
			a = 10;
			b = Integer.parseInt(s.nextLine());
			c = a/b;
		}catch(NumberFormatException e) {
			System.out.println("오류원인(포맷)"+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("오류원인(연산)"+e.getMessage());
		}catch (Exception e) {
			System.out.println("뭔가 잘못됨");
			e.printStackTrace();
		}
		System.out.println("과연 c 값은? "+c);
		
		
		
		
	}

}

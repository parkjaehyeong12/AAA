package 실습2KBStudent;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//1번
		int sum = 0;
		for(int i = 3; i<=8; i++ ) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
		//2번
		Scanner s = new Scanner(System.in);
		
		String az = s.nextLine();
		
		String za = "";
		
		for(int i = az.length()-1; i>=0;i--) {
			za = za+ az.charAt(i);
		}
		
		StringBuffer reverse = new StringBuffer(az);
		System.out.println(reverse.reverse().toString());
		
		System.out.println(za);
		
		//3번 바이트값 입력시 비트값 출력
		System.out.println("바이트값을 입력하시오");
		int byte1 = s.nextInt();
		System.out.println("비트로 바꾸면 "+byte1*8+"bit");
		
		
		
		
		
	}

}

package my.hello.javastudy;
import java.util.Scanner;


public class HelloJava01 {

	public static void main(String[] args) {
		// 로또 프로그램
		Scanner s = new Scanner(System.in);
		int num[]= new int[7];
		
		int n = s.nextInt();
		
		for(int x=0; x<n;x++) {
		
		for(int i = 0; i<7; i++) {
			num[i] = (int)(Math.random()*45) + 1;
			for(int j = 0; j<i;j++) {
				if(num[i]==num[j])
				{
					i--;
					break;
				}
			}
			
		}
		for(int i = 0; i<7; i++) {
		System.out.print(num[i]+" ");
		}
		
		}
		
	}

}

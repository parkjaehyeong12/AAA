package my.hello.javastudy;
import java.util.Arrays;
import java.util.Scanner;

public class HelloJava02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int count = s.nextInt();
		if(count<1||count>5)
		{
			System.out.println(count+" 횟수는 잘못된 값!");
			return;
		}
		
		for(int i = 0; i<count;i++) {
			int [] lotto = new int[6];
			for(int j =0; j<lotto.length;j++) {
				int num=(int)(Math.random()*45)+1;
				
				boolean isDuplicate = false;
				//contains,indexOf는 객체대상임
				
				for(int k = 0; k<j;k++) {
					if(lotto[k]==num) {
						isDuplicate = true;
						j--;
						break;
					}
				}
				//isDuplicate 가 false가 되면 앞의 느낌표에
				//의해서 if안의 값이 true가 됨
				//! : not 연산
				
				if(!isDuplicate)
				 lotto[j]=num;
			}
				int bns = (int)(Math.random()*45) + 1;
				for(int j =0; j<lotto.length;j++)
				{
					if(bns==lotto[j]) {
					bns=(int)(Math.random()*45)+1;
					j=-1;
					}
				}
				Arrays.sort(lotto);
				System.out.print((i+1)+"번째 번호");
				System.out.print(Arrays.toString(lotto));
				System.out.print(" 보너스번호: "+bns);
			    System.out.println();
		}
	
	
		
	
	}

}

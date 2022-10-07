package javastudy01;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Comparator;

public class 실습_Que2 {
   public static void main(String args[]) {
	   Scanner s = new Scanner(System.in);
	   int count = s.nextInt();
		if(count<1||count>5)
		{
			System.out.println(count+" 횟수는 잘못된 값!");
			return;
		}
		
		for(int i = 0; i<count;i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
//			int [] lotto = new int[6];
			for(int j =0; j<6;j++) {
				int num=(int)(Math.random()*45)+1;
				
				boolean isDuplicate = false;
				//contains,indexOf는 객체대상임
				
				for(int k = 0; k<j;k++) {
					if(lotto.get(k)==num) {
						isDuplicate = true;
						j--;
						break;
					}
				}
				
				if(!isDuplicate) {
					lotto.add(num);
				}
				
			}
				int bns = (int)(Math.random()*45) + 1;
				for(int j =0; j<lotto.size();j++)
				{
					if(bns==lotto.get(j)) {
					bns=(int)(Math.random()*45)+1;
					j=-1;
					}
				}
				lotto.sort(Comparator.naturalOrder());
				
			
				//ArrayList 오름차순 정렬
				
				System.out.print((i+1)+"번째 번호");
				
				System.out.print(lotto);
				System.out.print(" 보너스번호: "+bns);
			    System.out.println();
		}
	   
	   
   }
}

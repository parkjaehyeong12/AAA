package javastudy02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelloJava01_Lotto1 {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("얼마너치 살건가요?");
		int count = s.nextInt();
		//만약 4100원 이런 금액이라면 어떻게 할까요
		int gusreum = count%1000; 
		
		count = count/1000;//5000입력하면 count =5
		
		if(count>5 || count<1)
		{
			System.out.println("금액이 잘못되었습니다.");
			return;
		}
		
		if(gusreum>0) {
			System.out.println("거스름돈은 "+gusreum+"원 입니다.");
		}
		
		for(int i =0; i<count;i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			
			for(int j = 0; j<6; j++) {
				int num = (int)(Math.random()*45)+1;
				boolean isDuplicate = false;
				
				for(int k =0; k<j;k++) {
					if(lotto.get(k)==num) {
						isDuplicate = true;
						j--;
						break;
					}
				}
				 //isDulplicate가 false라면 if 안의 값은 true가 되고
				// lotto 에 추가
				
				if(!isDuplicate)
					lotto.add(num);
			}
			
			Collections.sort(lotto);
		
			int bns = (int)(Math.random()*45)+1;
			for(int j = 0; j<lotto.size(); j++) {
				if(bns == lotto.get(j)) {
					bns =(int)(Math.random()*45)+1;
					j=-1;
				}
			}
			System.out.print(lotto.toString());
			System.out.println(" 보너스: "+ bns);
//			lotto.clear(); //lotto 안에 있는 값을 전부 삭제(Remove)
			
		}
		
		
	}
}

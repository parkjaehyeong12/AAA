package javastudy02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelloJava01_Lotto1 {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("�󸶳�ġ ��ǰ���?");
		int count = s.nextInt();
		//���� 4100�� �̷� �ݾ��̶�� ��� �ұ��
		int gusreum = count%1000; 
		
		count = count/1000;//5000�Է��ϸ� count =5
		
		if(count>5 || count<1)
		{
			System.out.println("�ݾ��� �߸��Ǿ����ϴ�.");
			return;
		}
		
		if(gusreum>0) {
			System.out.println("�Ž������� "+gusreum+"�� �Դϴ�.");
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
				 //isDulplicate�� false��� if ���� ���� true�� �ǰ�
				// lotto �� �߰�
				
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
			System.out.println(" ���ʽ�: "+ bns);
//			lotto.clear(); //lotto �ȿ� �ִ� ���� ���� ����(Remove)
			
		}
		
		
	}
}

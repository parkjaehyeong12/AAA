package �ǽ�2KBStudent;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//1��
		int sum = 0;
		for(int i = 3; i<=8; i++ ) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
		//2��
		Scanner s = new Scanner(System.in);
		
		String az = s.nextLine();
		
		String za = "";
		
		for(int i = az.length()-1; i>=0;i--) {
			za = za+ az.charAt(i);
		}
		
		StringBuffer reverse = new StringBuffer(az);
		System.out.println(reverse.reverse().toString());
		
		System.out.println(za);
		
		//3�� ����Ʈ�� �Է½� ��Ʈ�� ���
		System.out.println("����Ʈ���� �Է��Ͻÿ�");
		int byte1 = s.nextInt();
		System.out.println("��Ʈ�� �ٲٸ� "+byte1*8+"bit");
		
		
		
		
		
	}

}

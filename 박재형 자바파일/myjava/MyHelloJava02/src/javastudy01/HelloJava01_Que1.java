package javastudy01;
import java.util.Scanner;

public class HelloJava01_Que1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] numbers = new int[5];
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//numbers 배열엔 [0,0,0,0,0]
		//값이 0이 없을 경우도 있으므로 numbers 에 값을 넣고
		//그 다음에 max, min 지정 후 비교
		
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(i+1+"번째 값 입력");
			numbers[i] = s.nextInt();
		}
		//가장 첫번째 값을 max, min으로 가정한다.
		
		int max = numbers[0];
		int min = numbers[0];
		
		//foreach 이용하기 (자바스크립트의 for of 구문과 유사)
		for(int i :numbers) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		} //i는 numbers의 [i]번째 
		//for문 이용
		for(int i= 1;i<numbers.length;i++)
		{
			if(numbers[i]>max)
				max = numbers[i];
			if(numbers[i]<min)
				min= numbers[i];
		}
		
		System.out.println("최댓값은 "+max);
		System.out.println(String.format("최솟값은 %d\n",min));
		
		

	}

}

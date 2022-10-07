package javastudy01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloJava02_Que2 {

	public static void main(String[] args) {
		// 배열: 크기가 고정되고 특정 인덱스에 값 수정함
		// ArrayList: 크기가 고정되어 있지 않음.
		// 대신 값이 이미 들어간 부분에 대해서는 값 수정 가능
		// 그리고 특정부분 삭제 가능. 삭제시 길이 변함.

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 다형성이랑 인터페이스를 알아야 이해가능

		List<Integer> nums = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 숫자 입력하기");
			nums.add(s.nextInt());// 자바스크립트의 푸쉬 push 와 유사
		}
		
		// foreach 적고 컨트롤 스페이스 // 코드 정렬은 컨트로 시프트 에프

		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		//값을 지울땐 역 for문을 쓴다.
		//길이가 5라면 4,5,2,1,0 이렇게 for문이 돌아감
		
		System.out.println("몇 미만의 숫자를 지울까요");
		int cutline=s.nextInt();
		
		for(int i = nums.size()-1;i>=0;i--) {
			if(cutline>nums.get(i)) //get은 i번째 값을 읽어오는것
				nums.remove(i);//remove는 i번째 지움
		}
		nums.set(0, 1); //0번째 숫자를 1로 수정
		
		
		//int 와 integer 의 차이
		for (Integer integer : nums) {
			System.out.println(integer);
		}

	}

}

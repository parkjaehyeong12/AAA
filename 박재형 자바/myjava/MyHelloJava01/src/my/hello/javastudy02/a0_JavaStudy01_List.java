package my.hello.javastudy02;

import java.util.ArrayList;

public class a0_JavaStudy01_List {
	public static void main(String ars[]) {
		int [] numbers = new int[5];
		
		//길이를 미리 정하지 않는다, js 배열과 유사
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//값을 할당해보는것(배열)
		numbers[0] =10;
		numbers[1] =30;
		System.out.println("첫번째값: "+numbers[0]);
		
		//값을 추가하는 것
		nums.add(10); //js의 push처럼 새로운 값이 추가됨
		//js의 배열처럼 임의의 위치에 값을 추가하진 못함
		nums.add(30);
		
		//특정 번째의 값을 수정해보기
		nums.set(0, 20) ;//첫번째 값을 20으로 수정
		System.out.println(nums.get(0));
		
		
		
		//foreach 적고 ctrl space 하면 생김
		//배열의 길이만큼 반복문을 수행
		//콜론(:) 앞에 있는 건 배열 안에 있는 구성요소들
		for(Integer integer0:numbers) {
			System.out.println(integer0);
		}//배열의 길이가 5. 2,3,4번째에는 기본값인 0이 있음
		
		//ArrayList = 값을 삭제할 수 있다.
		//배열은 값 삭제가 안됐다...
		
		nums.remove(0); //첫번째 값 삭제
		nums.add(100);
		nums.add(30); 
		nums.add(30);
		nums.remove((Integer)30); //값이 30인 것 삭제
		
		System.out.println("-------------");
		
		
		
		
		for(Integer integer1:nums) {
			System.out.println(integer1);
		}
		
		
	}
}

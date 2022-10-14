package 실습1KBStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 메인 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		List<KBStudent> stuarr = new ArrayList<KBStudent>();
		System.out.println("학생 몇명 할 것입니까?");
		int n = Integer.parseInt(s.nextLine());
		
		for(int i = 0; i<n;i++) {
			KBStudent k = new KBStudent();
			
			try {
				System.out.println("학생 이름?"); //박재형 11
				k.setName(s.nextLine());
				System.out.println("학생 성별?");
				k.setGender(s.nextLine());
				
				if(k.getName().matches("[0-9]*"))
				{
					throw new Exception();
				}
				if(k.getGender().matches("[0-9]*"))
				{
					throw new Exception();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				i--;
				System.out.println("이름혹은 성별에 숫자포함 처음부터 다시입력^^");
			}
			
				
			System.out.println("학생 나이?");
			k.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("학생 번호?");
			k.setNumber(Integer.parseInt(s.nextLine()));
			//k.getNumber()==stuarr.get(j).getNumber()
			int a = 0;
			for(int j = 0; j<i;j++) {
				if(k.equals(stuarr.get(j).getNumber())) {
					i--;
					a = 1;
					System.out.println("이 학생에 대한 정보는 다시 입력하십시오");
					break;
				}
			}
			if(a==0) {
			stuarr.add(k);
			}
		}
		
		Collections.sort(stuarr);
		
		for(int i = 0; i<n; i++) {
			System.out.println(stuarr.get(i).toString());
		}
	
	}
}

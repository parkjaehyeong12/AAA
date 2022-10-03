package my.hello.javastudy02;

import java.util.ArrayList;

public class a2_JavaStudy02_List_class {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student();
		students[1] = new Student("이동준",34,1);
		
		Student s = new Student("박지호",29,2);
		students[2] = s;
		
		//int나 double등 변수 선언할 때와는 다르다.
		//1.new 키워드와 생성자가 있어야지만 객체 생성된다.
		//2.생성자 안에 경우에 따라선 매개변수가 들어가기도 함
		
		ArrayList<Student> mystudents
		= new ArrayList<Student>();
		
		mystudents.add(new Student("김진규",30,5));
		
		mystudents.add(new Student());
		
		Student ss = new Student("도광현",25,4);
		mystudents.add(ss);
		
		//이게 가능
		mystudents.add(new Student("박재형"));
		
		//new키워드 + 생성자
		//인스턴스(Instance)라고 부른다.
		//Student의 Instance은 Student의 예시
		//학생이라는 추상적 개념을 구체적 예시로 보여준것
		
		//s0와 s1은 아무것도 가리키지 않는다.
		Student s0;
		Student s1= null;
		mystudents.add(s1);
		students[0] =s1;
		
		//얕은 복사...
		
		
		
	}
}

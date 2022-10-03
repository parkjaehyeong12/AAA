package my.hello.javastudy02;

public class Student {
	private String name;
	private int age;
	private double score;
	
	//생성자
	//만약 속성들과 getter,setter만 적었다면
	//암묵적으로 아래와 같이 아무것도 없는 생성자가 자동으로 만들어진 것.
	public Student() {
	
	}// 기본 생성자. 아무런 생성자를 안 만들면 위 생성자로 설정되고
	//만약 뭔가 만들면 위 생성자는 삭제
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
//	 선생님 풀이
	
	//오버로딩
	//함수나 생성자에서 매개변수가 다르면 이름이 같아도 다른 애로 취급한다.
	
	//alt shift s 누르고 그 다음 r키 누르기
	//마우스 오른쪽 클릭-> Source-> Generate getter setter
	
	
	//1
	public Student(String name) {
		this.name = name;
	}

	//2

//	public String getName(String title) {
//		return name+title; //이런식으로 해도 됩니다.
//	}
	
	public String getName() {
		return name; //이런식으로 해도 됩니다.
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	
	
//    내가 한 부분	
//	public String getName () {
//		return this.name;
//	}
//	
//	public int getAge () {
//		return this.age;
//	}
//	
//	public double getScore () {
//		return this.score;
//	}
//	
//	public void setName(String n) {
//		this.name=n;
//	}
//	public void setAge(int a) {
//		this.age=a;
//	}
//	public void setScore(double s) {
//		this.score=s;
//	}
//	
//	public void setAndPrint (String n, int a, int s)
//	{
//		this.name=n;
//		this.age=a;
//		this.score=s;
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(score);		
//	}
	
	
}


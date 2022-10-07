package javastudy05_answer;
//import javastudy04.Student;
//다른 패키지일 경우에는 import를 하거나
//패키지명.클래스하면 됨

//같은 패키지 안에도 Student 있고
//다른 패키지 안에도 Student 있는데,
//다른 패키지 안에 있는 Student 를 상속하고 싶을 경우에는 꼭
//패키지명.Student를 한다.

//javastudy04.Student------------ㄱ
public class KBStudent extends javastudy04.Student {
	private String gender;
	private String education;
	
	public void attend(String att) {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!"); //att 출,결석
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
}

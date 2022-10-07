package javastudy02;

public class ProgrammingTeacher extends Teacher {

	public ProgrammingTeacher(String n, String m) {
		setName(n);
		setMajor(m);
	}
	
	public ProgrammingTeacher() {
		
	}
	
	public void Teach() {
		System.out.println("프로그래밍 선생님의 이름은 "+super.getName()+", 전공은 "+super.getMajor());
	}
}

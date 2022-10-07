package javastudy02;

public class JavaProgrammingTeacher extends ProgrammingTeacher{

	public JavaProgrammingTeacher(String n, String m) {
		setName(n);
		setMajor(m);
	}
	
	public JavaProgrammingTeacher() {
		
	}
	
	public void Teach() {
		super.Teach();
		System.out.println("그리고 주로 자바를 가르치십니다.");
	}
}

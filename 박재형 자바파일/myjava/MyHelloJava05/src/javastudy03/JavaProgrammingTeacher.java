package javastudy03;

public class JavaProgrammingTeacher extends ProgrammingTeacher {

	public JavaProgrammingTeacher(String Name, String Major) {
		setName(Name);
		setMajor(Major);
	}
	@Override
	public void Teach() {
		System.out.println("이클립스냐 인텔리제이냐");
		System.out.println(getName()+"쌤의 "+getMajor()+"강의");
	}
}

package javastudy02;

public class ProgrammingTeacher extends Teacher {

	public ProgrammingTeacher(String n, String m) {
		setName(n);
		setMajor(m);
	}
	
	public ProgrammingTeacher() {
		
	}
	
	public void Teach() {
		System.out.println("���α׷��� �������� �̸��� "+super.getName()+", ������ "+super.getMajor());
	}
}

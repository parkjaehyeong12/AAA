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
		System.out.println("�׸��� �ַ� �ڹٸ� ����ġ�ʴϴ�.");
	}
}

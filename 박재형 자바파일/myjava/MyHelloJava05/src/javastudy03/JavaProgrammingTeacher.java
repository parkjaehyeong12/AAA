package javastudy03;

public class JavaProgrammingTeacher extends ProgrammingTeacher {

	public JavaProgrammingTeacher(String Name, String Major) {
		setName(Name);
		setMajor(Major);
	}
	@Override
	public void Teach() {
		System.out.println("��Ŭ������ ���ڸ����̳�");
		System.out.println(getName()+"���� "+getMajor()+"����");
	}
}

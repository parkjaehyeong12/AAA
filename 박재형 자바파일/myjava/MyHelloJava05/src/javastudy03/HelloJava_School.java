package javastudy03;

public class HelloJava_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new MathTeacher();
		MathTeacher m = new MathTeacher();
		ProgrammingTeacher p = new ProgrammingTeacher();
		
		JavaProgrammingTeacher j
		= new JavaProgrammingTeacher("�̵���","�Ӻ����");

		t.Teach();
		m.Teach();
		p.Teach();
		
		Teacher t2 = new Teacher() {

			@Override
			public void Teach() {
				// TODO Auto-generated method stub
				
			}
		
		};
		
		ProgrammingTeacher p2 = new ProgrammingTeacher() {
			public void Teach() {
				System.out.println(getName()+"���� c��� �����ĵ帳�ϴ�.");
			}
		};
		p2.setName("������");
		p2.Teach();
		
		
	}

}

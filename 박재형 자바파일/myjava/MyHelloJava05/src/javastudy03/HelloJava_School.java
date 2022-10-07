package javastudy03;

public class HelloJava_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new MathTeacher();
		MathTeacher m = new MathTeacher();
		ProgrammingTeacher p = new ProgrammingTeacher();
		
		JavaProgrammingTeacher j
		= new JavaProgrammingTeacher("이동준","임베디드");

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
				System.out.println(getName()+"쌤이 c언어 가르쳐드립니다.");
			}
		};
		p2.setName("이유나");
		p2.Teach();
		
		
	}

}

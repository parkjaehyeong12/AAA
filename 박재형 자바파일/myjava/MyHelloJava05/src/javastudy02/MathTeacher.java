package javastudy02;

public class MathTeacher extends Teacher {

	public MathTeacher(String n, String m) {
		setName(n);
		setMajor(m);
	}
	
	public MathTeacher() {
		
	}
	
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("수학선생님의 이름은 "+super.getName()+", 전공은"+super.getMajor());
	}

}

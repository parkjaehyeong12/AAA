package javastudy04;

public class KBStudent extends Student {
	private String gender;
	private String education;

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

	public void attend() {
		System.out.println("�̸��� "+this.getName());
		System.out.println("���̴� "+this.getAge());
		System.out.println("������ "+this.gender);
		System.out.println("�з��� "+this.education);
	}
	
	public KBStudent() {
		
	}

	
}

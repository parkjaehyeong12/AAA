package javastudy05_answer;
//import javastudy04.Student;
//�ٸ� ��Ű���� ��쿡�� import�� �ϰų�
//��Ű����.Ŭ�����ϸ� ��

//���� ��Ű�� �ȿ��� Student �ְ�
//�ٸ� ��Ű�� �ȿ��� Student �ִµ�,
//�ٸ� ��Ű�� �ȿ� �ִ� Student �� ����ϰ� ���� ��쿡�� ��
//��Ű����.Student�� �Ѵ�.

//javastudy04.Student------------��
public class KBStudent extends javastudy04.Student {
	private String gender;
	private String education;
	
	public void attend(String att) {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!"); //att ��,�Ἦ
	}

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
}

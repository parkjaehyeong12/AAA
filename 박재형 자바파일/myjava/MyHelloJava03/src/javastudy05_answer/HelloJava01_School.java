package javastudy05_answer;

public class HelloJava01_School {
	public static void main(String[] args) {
		//�ٸ� ���� ���� ��Ʃ��Ʈ
		javastudy04.Student s1 = new
				javastudy04.Student();
		s1.setAge(25);
		s1.setName("�輺ȯ");
		
		s1.study();
		
		System.out.println();
		
		//���� ���� ���� ��Ʃ��Ʈ
		Student ss = new Student();
		ss.level=34;
		
		KBStudent kb1 = new KBStudent();
		kb1.setName("������");
		kb1.setAge(40);
		kb1.setEducation("����");
		kb1.setGender("����");
		kb1.study();
		
		System.out.println();
		
		kb1.attend("�Խ�");
		
		System.out.println();
		
		kb1.attend("���");
		
		
	}
}

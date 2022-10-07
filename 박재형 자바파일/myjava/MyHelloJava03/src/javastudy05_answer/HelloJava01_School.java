package javastudy05_answer;

public class HelloJava01_School {
	public static void main(String[] args) {
		//´Ù¸¥ Æú´õ ¾ÈÀÇ ½ºÆ©´øÆ®
		javastudy04.Student s1 = new
				javastudy04.Student();
		s1.setAge(25);
		s1.setName("±è¼ºÈ¯");
		
		s1.study();
		
		System.out.println();
		
		//°°Àº Æú´õ ¾ÈÀÇ ½ºÆ©´øÆ®
		Student ss = new Student();
		ss.level=34;
		
		KBStudent kb1 = new KBStudent();
		kb1.setName("±èÇı¹Î");
		kb1.setAge(40);
		kb1.setEducation("´ëÁ¹");
		kb1.setGender("¿©¼º");
		kb1.study();
		
		System.out.println();
		
		kb1.attend("ÀÔ½Ç");
		
		System.out.println();
		
		kb1.attend("Åğ½Ç");
		
		
	}
}

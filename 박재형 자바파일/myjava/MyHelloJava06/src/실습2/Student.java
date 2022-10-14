package 실습2;

public class Student {
	private int age;
	private String Name;
	
	public int getAge() {
		return age;
	}
	
	public Student(String n , int a) {
		this.Name=n;
		this.age=a;
	}
	public Student() {
		
	}
	
	
	
	public void setAge(int age) throws Exception {
//		try {
//			if(age<=0) {
//				throw new Exception("에러입니다.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		if(age<=0) {
			throw new Exception("에러입니다.");
		}
		this.age = age;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}

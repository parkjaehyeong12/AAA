package �ǽ�1KBStudent;

public class KBStudent implements Comparable<KBStudent> {
	private String name;
	private String gender;
	private int age;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�� �л��� �̸��� "+name+", ��ȣ�� "+number+"��, ������ "+gender+", ���̴� "+age+"���Դϴ�.";
	}
	

	public boolean equals (int a) {
		return this.number==a;
}
	
	 public int compareTo(KBStudent kbs) {
		 if (kbs.age < age) {
			 return 1;        
			 } else if (kbs.age > age) {
				 return -1;
				 }
		 return 0;    }

	
	
}

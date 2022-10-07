package javastudy03;

public class KBCustomer {

	//public, private : 정보의 은닉
	//(c#책에선 캡슐화라고 하는데, 캡슐은 아니다.)
	
	private int age;
	private String name;
	private String cNum;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	
	
}
package my.hello.javastudy02;

public class Tourist {
     private String name;
     private int age;
     private int beonho;
     private String sNum;
     //alt shift s 그리고 o
     //마우스 오른쪽 클릭-> Source ->Generate Constructor using field
     /*아무 생성자도 안 만들면 텅빈 생성자가 만들어지는데 뭔가 만들면 없어진다. 그래서 못쓴다.
      * 근데 텅빈 생성자까지 선언을 해주면 쓸 수 있다. */
     
     
	public Tourist(String name, int age, int beonho, String sNum) {
//		super(); // 조상객체(부모객체)의 생성자
		this.name = name;
		this.age = age;
		this.beonho = beonho;
		this.sNum = sNum;
	}
	public Tourist(String name) {
		this.name = name;
	}
	
	
	//alt shift s 그리고 r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBeonho() {
		return beonho;
	}
	public void setBeonho(int beonho) {
		this.beonho = beonho;
	}
	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	
	
	
     
     
}

package javastudy02;

public abstract class Teacher {
	private String name;
	private String major;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}



	public abstract void Teach();
}

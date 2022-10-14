package mytest.myjava;

public class Students {
	private String name;
	private String major;
	private String pw;
	private String hobby;
	private String protocol;
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
		if(major.equals("eng"))
			this.major= "영어";
		else if(major.equals("math"))
			this.major= "수학";
		else if(major.equals("kor"))
			this.major= "국어";
		else
			this.major= major;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String[] hobbys) {
		//this.hobby = hobby;
		this.hobby="";
		for(int i = 0; i<hobbys.length;i++){
			switch(hobbys[i]){
			case "cook":
				this.hobby +="요리";
				break;
			case "run":
				this.hobby+="달리기";
				break;
			case "swim":
				this.hobby+="수영";
				break;
			case "sleep":
				this.hobby+="잠자기";
				break;	
			}
			if(i!=hobbys.length-1)//마지막 인덱스 아닐때
				this.hobby+=",";	
		}
	}
	
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	
}

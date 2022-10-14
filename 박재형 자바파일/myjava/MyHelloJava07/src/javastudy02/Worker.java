package javastudy02;

public class Worker {
	private String Name;
	private String cNum;
	public Worker(String name, String cNum) {
		super();
		//alt shift s 누르고 o 누르기
		Name = name;
		this.cNum = cNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: "+Name+", 사번: "+cNum;
	}
	
	
	//equals를 재정의해놔서 사번과 이름이 같은 사원은 같은 사원으로 간주함
	
	@Override
	public boolean equals(Object obj) { // obj는 여기거 말고 딴거
		Worker w = (Worker)obj; //w와 obj는 같은 곳을 가리킴
		return w.getcNum().equals(cNum) && w.getName().equals(Name);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	
	
	
}

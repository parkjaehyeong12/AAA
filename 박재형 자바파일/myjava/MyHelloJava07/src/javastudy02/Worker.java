package javastudy02;

public class Worker {
	private String Name;
	private String cNum;
	public Worker(String name, String cNum) {
		super();
		//alt shift s ������ o ������
		Name = name;
		this.cNum = cNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸�: "+Name+", ���: "+cNum;
	}
	
	
	//equals�� �������س��� ����� �̸��� ���� ����� ���� ������� ������
	
	@Override
	public boolean equals(Object obj) { // obj�� ����� ���� ����
		Worker w = (Worker)obj; //w�� obj�� ���� ���� ����Ŵ
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

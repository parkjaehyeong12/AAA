package javastudy01;

public class Pikachu implements Animalable , Cloneable{
	//�������̽� Cloneable ����, �� ������ clone �������̵� �ϱ�
	//�ٸ� ��Ű�������� ��� Ȱ���Ϸ��� protected�� public���� �ٲٱ�
	//Cloneable�� clone �޼Ҵ� �̹� default�� �����Ǿ� ������,
	//�������̵��� �ؾ� �� �� �ִ�.
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public Pikachu(String name) {
		Name = name;
	}

	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("��ī��ī");
	}

}

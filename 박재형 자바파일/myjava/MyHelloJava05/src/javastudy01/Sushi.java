package javastudy01;

public class Sushi extends Food{
	private String wasabiBrand;

	//�Ű������� �ִ� �����ڸ� �ִٸ�
	//�׸��� �׷� �����ڰ� ������ �ִٸ�
	// �� ������ �� �ϳ��� ���� �ȴ�.
	// ����Ŭ������ �Ű����� ���� �����ڰ� �����Ǹ�
	//�ڼ�Ŭ������ ������ �Ű������� �־�� ��
	
	public Sushi(String name) {
		super(name); //super�� Food Ŭ������ �����ڸ� �ǹ��Ѵ�.	
	}

	public Sushi(String name, int price, String wasabiBrand) {
		super(name, price);
		this.wasabiBrand = wasabiBrand;
	}

	public Sushi(String name, int price) {
		super(name, price);
	}

	public String getWasabiBrand() {
		return wasabiBrand;
	}

	public void setWasabiBrand(String wasabiBrand) {
		this.wasabiBrand = wasabiBrand;
	}
	
	
	
}

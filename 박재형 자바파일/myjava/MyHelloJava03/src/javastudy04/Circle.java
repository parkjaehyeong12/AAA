package javastudy04;

public class Circle {
	private int r;
	//PI�� ���� ��� Ŭ������ ���������� �����ϰ�
	//���������� �� �� �ִ� ������ Ŭ���� ����
	//�ν��Ͻ����� �ٸ� �� �ƴϴ�.	
	private static double PI;

	//���������� �� �� �ִ� �޼ҵ带 Ŭ���� �޼ҵ�
	public static double getPI() {
		return PI;
	}
	//Ŭ���� �޼ҵ�
	public static void setPI(double pI) {
		PI = pI;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	//�Ű������� �ִ� �����ڸ� ����༭
	//����Ʈ �����ڴ� ������
	public Circle(int r) {
		super();
		this.r=r;
		PI=3.14;
	}
	
	public double getArea() {
		return r*r*PI;
	}
	public Circle() {
		
	}
	
}

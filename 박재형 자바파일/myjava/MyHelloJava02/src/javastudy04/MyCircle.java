package javastudy04;

public class MyCircle {
	private int r;
	private final double pi = 3.14;
	
	//final �� ���ϸ� ������ �ʴ´�.
	
	public int getR() {
		return r;
	}
	//������ ���� 0������ ��� 0���� �������ѹ�����.
	public void setR(int r) {
		if(r<=0)
			this.r=0;
		else;
			this.r = r;
	}
	
	//publicŸ���� �Լ��� 2�� ���� �����.
	//���� ���ϱ�� �ѷ� ���ϱ�
	
	public double getArea() {
		if(r<0)
		{
			System.out.println("�������� Ȯ�� �ٶ�");
			return 0;
		}
		return r*r*pi;
	}
	
	public double getRound() {
		if(r<0)
		{
			System.out.println("�������� Ȯ�� �ٶ�");
			return 0;
		}
		return 2*r*pi;
	}
	//������ = ���ϰ� ���� �Լ���� ����.
	//�����ڴ� ���ڱ״�� ������ �� ȣ���ϹǷ�
	//������ �����԰� ���ÿ� �Ӽ����� �ٷ� ������ �� �ִ�.
	//r���� ���߿� ���� �����ؾ� ������
	//�̷��� �Ű������� r�� ������ ����� ���ÿ� r�� ���� ������
	
	public MyCircle (int r) {
		setR(r);		
	}
	
	//�̷��� �����ڸ� ��������� ���� �ʳ�
	//������ �ִ� �����ڰ� ������
	//������ �Ʒ��� �ִ� �����ڰ� ǥ������� �ʾ����� ����Ǿ� �־���.
	
	//�ƹ��͵� ���� �����ڸ� ��������� ���ش�.
	public MyCircle() {
		
	}
	
	//�����ε�
	//�����ڳ� �Լ� ���� ��
	//�̸��� �Ȱ����� �Ű������� ������ Ÿ���� �ٸ� ��쿣
	// ���� �ٸ� �ɷ� ����Ѵ�.
	//�� MyCircle(r)�� MyCircle()�� ���� �ٸ� ������
	
	
	
}

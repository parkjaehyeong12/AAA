package javastudy05_answer;

import javastudy02.Circle;

public class Sphere extends Circle {

	//add constructor sphere
	//constructor: ������
	//super : ����Ŭ������ ������ ȣ���� ��
	//KBStudent�ʹ� �ٸ��� �̰� �����ڰ� �վ�� ��
	//Circle�� ����Ʈ ������(=�ƹ��͵� ���� ������)�� ���� ������
	//Circle�� �ִ� �����ڸ� ȣ���ؾ����� �� ��ü�� ���� �� �ִ�.
	
	public Sphere(int r) {
		super(r); //Circle Ŭ������ �����ڸ� ȣ���� ��
	}
	
	public double getVolume() {
		return (4.0/3)*getPI()*getR()*getR()*getR();
	}
	//���ο� �Ӽ��� �߰�x ���ο� ��� �߰�
	
	
	//protected
	//���� ��Ű�� �ȿ����� public�� ����.
	//����Ʈ ���� �����ڶ� ����������.
	//������ �޶�����
	//Sphere�� ��ӹ��� Ŭ���������� �̰� �� �� �ִ�.
	
	protected String Color;
	
	protected void spin() {
		System.out.println("���ۺ���~");
	}

}

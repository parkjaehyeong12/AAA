package javastudy05_answer;

import javastudy02.Circle;

public class HelloJava02_useRound {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1 = new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		//����
		//Ŭ���� ������ �θ�, �ڽ�Ŭ������ �����ؼ� ����.
		//�� static�� ���� �� �ڽ�Ŭ������ �θ�Ŭ������
		//��𿡼� �ٲٵ��� ���� ������ �޴´�.
		
		Circle.setPI(1);
		System.out.println(sp1.getVolume());
		
		Sphere.setPI(0);
		System.out.println(c1.getArea());
		
		
	}

}

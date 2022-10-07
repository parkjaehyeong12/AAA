package javastudy02;



public class HelloJava01_useCircle {
	//Ŭ���� �޼ҵ�
	public static void sayHello() {
		System.out.println("Hello World");
	}
	//�ν��Ͻ� �޼ҵ�
	public void toSay(String name) {
		System.out.println(name+"��, �ȳ�");
	}
	
	public static void main(String args[]) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		Circle.setPI(3.0); //PI���� �ٲٸ� ��� Circle�鿡�� ������ ��ģ��.
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		//Ŭ���� �޼ҵ� Ư¡
		//Ŭ���� �޼ҵ� �ȿ��� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ尡
		//������.
		//����: static �� ���� �͵��� �޸𸮿� ���� �ö󰡱� �����̴�.
		//Ŭ���� ������ Ŭ���� �޼ҵ�� ���α׷� �������ڸ��� �ö�
		//�ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� new Ű���� ���� ��
		//�޸𸮿� �ö󰣴�.
		sayHello();
		
		//static�� �پ��ִ� �޼ҵ� �ȿ���
		//static�� �پ��ִ� �޼ҵ峪 ������ �´�.
		//static�� ���� �޼ҵ� �ȿ��� 
		//static�� ���� ������ �޼ҵ� �� �� �ִ�.
		
		//static ���� �޼ҵ�(=�ν��Ͻ� �޼ҵ�)
		//ȣ���ϰ� ������ �ν��Ͻ� ����� ���� ȣ���ϸ� ��
		//�̷� �� ��üȭ��� ��(=�ڱ� �ڽ��� �̿��� �ν��Ͻ� �����)
		
		new HelloJava01_useCircle().toSay("�̵���");
		HelloJava01_useCircle temp=
				new HelloJava01_useCircle();
		temp.toSay("������");
		
	}
}

package my.hello.javastudy02;

public class Student {
	private String name;
	private int age;
	private double score;
	
	//������
	//���� �Ӽ���� getter,setter�� �����ٸ�
	//�Ϲ������� �Ʒ��� ���� �ƹ��͵� ���� �����ڰ� �ڵ����� ������� ��.
	public Student() {
	
	}// �⺻ ������. �ƹ��� �����ڸ� �� ����� �� �����ڷ� �����ǰ�
	//���� ���� ����� �� �����ڴ� ����
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
//	 ������ Ǯ��
	
	//�����ε�
	//�Լ��� �����ڿ��� �Ű������� �ٸ��� �̸��� ���Ƶ� �ٸ� �ַ� ����Ѵ�.
	
	//alt shift s ������ �� ���� rŰ ������
	//���콺 ������ Ŭ��-> Source-> Generate getter setter
	
	
	//1
	public Student(String name) {
		this.name = name;
	}

	//2

//	public String getName(String title) {
//		return name+title; //�̷������� �ص� �˴ϴ�.
//	}
	
	public String getName() {
		return name; //�̷������� �ص� �˴ϴ�.
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	
	
//    ���� �� �κ�	
//	public String getName () {
//		return this.name;
//	}
//	
//	public int getAge () {
//		return this.age;
//	}
//	
//	public double getScore () {
//		return this.score;
//	}
//	
//	public void setName(String n) {
//		this.name=n;
//	}
//	public void setAge(int a) {
//		this.age=a;
//	}
//	public void setScore(double s) {
//		this.score=s;
//	}
//	
//	public void setAndPrint (String n, int a, int s)
//	{
//		this.name=n;
//		this.age=a;
//		this.score=s;
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(score);		
//	}
	
	
}


package javastudy03;

import java.util.Random;

public class HelloJava01_Customer_Manager {

	public static void main(String[] args) {
		//class�� �̿��ؼ� ������ ������ ��
		//�ݵ�� new Ű���尡 �ʿ�
		//�ֳĸ� ����� ���� �ڷ����� �Ϲ����� �ڷ����� �ƴϴ�.
		//�׷��� �޸𸮸� ���� �Ҵ������ ��
		//new Ű���� = �޸� '�Ҵ�' Ű���� c�� malloc�̶� ����.
		
		Integer i = new Integer(5);
		Random r = new Random();
		
		//Integer�� ���� �̹� �����ϴ� ��ü�鵵
		//new Ű���带 �Ἥ �޸� �Ҵ��ϱ�� �Ѵ�.
		//�ٸ� Customeró�� ������ ���� �� '������' �Ҵ��ؾ� �Ѵ�.
		
		//new �ڿ� ���� Ŭ������()�� �ǹ̴�
		//�޸𸮸� ��ŭ, � ���·� �Ҵ����� �����ִ°�
		//Customer ���·� �Ҵ���
		
		//c1�� ������ ��ġ�� �����Ͽ� ����� ����
		
		//���� ���� class�� ��� Ÿ���� ��������
		//new Ű����� Ŭ�������� �̿��ؼ� ����
		
		//Ŭ���� �̿��ؼ� ������ ������ Ŭ���� ��ü�� ��ü��� �Ѵ�.
		Customer c1 = new Customer();
		c1.name= "������";
		c1.age=30;
		c1.cNum="00001";
		

		Customer c2;
//		c2.name="�̵���";
//		c2.age=34;
//		c2.cNum="00000";
		
		KBCustomer kb1 = new KBCustomer();
		
//		Circle c = new Circle();
		
		KBCustomer k1 = new KBCustomer();
		k1.setAge(34);
		k1.setName("�̵���");
		k1.setcNum("00000");
		
		System.out.println(k1.getAge());
		System.out.println(k1.getName());
		System.out.println(k1.getcNum());
		
	}

}

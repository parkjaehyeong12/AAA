package javastudy01;

import java.util.ArrayList;
import java.util.List;

public class HelloJava01_With_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu("����");
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		Animalable d = new Animalable() {
			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("�۸� ¢�´�.");
			}			
		};
		Plantable myp = new Plantable() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("LG Ʒ��� ���� ��");
			}
			
		};
		
		Pokemonable g = new Pokemonable() {

			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("��������.");
			}

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("�ٴټӿ��� �ڶ���.");
			}

			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("�źϰź� �� Death.");
			}
			
		};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		List<Integer> ns = new ArrayList<Integer>();
		
		//try catch ���� -java, c#���� ���� ����
		//try �� ������ �κ��� ������ ���� catch�κ����� �Ѿ��
		//���α׷��� ������� �ʴ´�.(try catch ���� ���¼� �������� �״�� �����)
		
		try {
			//���� ���� �̽��� �ذ��� ���� - Cloneable �̶�� �������̽� Ȱ��
			Pikachu pipi = (Pikachu)p.clone();
			pipi.setName("����׶���");
			System.out.println(p.getName());
			System.out.println(pipi.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		Pikachu pipi = p;
//		pipi.setName("����׶���");
//		System.out.println(p.getName());
		//p�� �̸��� �����ε� �� pipi�� ����׶��̷� �ٲٴ� p�� �ٲ���?
		//pipi�� p�� ���� ��ġ�� �����ϱ� �����̴�.(������)
		
		
		
		//����
		//���߸���
		//�޼ҵ尡 �ϳ� �ִ� �������̽��� ���ؼ� ������
		//�͸� Ŭ������ ���ΰ�
		
		//Plantable�� grow�� �������̵� �Ѱ�
		//�̰� ȭ��ǥ���·� �ٿ������� =����
		//lamda
		//�޼��尡 �ϳ��� �ִ� �������̽��� �Ǵµ�
		
		Plantable myFlower = ()->{
			System.out.println("�������� �ڶ󳪿�");
		};
		myFlower.grow();
		
		
		
		
	}

}

package javastudy01;

import java.util.ArrayList;

public class Hellojava01_Study_Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		Animal a1 = new Dog();
		Animal c2 = new Cat();
		
		//�������� ������ ��
		//����Ŭ���� Ÿ������ ���� �迭�̳� ArrayList��
		//�ڼ�Ŭ���� Ÿ���� ��ü���� ����.
		ArrayList <Animal> zoo = new ArrayList<Animal>();
		zoo.add(a);
		zoo.add(d);
		zoo.add(c);
		zoo.add(a1);
		zoo.add(c2);
		zoo.add(new Animal());
		zoo.add(new Dog());
		zoo.add(new Cat());
		
		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		Animal aa = new Animal();
		aa.setAge(5);
		aa.setName("�ڻԼ�");
		
		Dog dd = new Dog();
		dd.setAge(3);
		dd.setName("�����");
		dd.setHairColor("��蹫�̻�");
		Cat cc = new Cat();
		cc.setAge(2);
		cc.setName("������");
		cc.setEyeColor("�����");
		
		animalHospital.add(aa);
		animalHospital.add(dd);
		animalHospital.add(cc);
		
		
//		if(dd instanceof Dog)
//		{
//			((Dog)dd).bark();
//		}
		
//		for(Animal a : animalhospital)
		
		for (int i = 0; i<animalHospital.size();i++) {
			if(animalHospital.get(i) instanceof Dog)
			{
				((Dog)animalHospital.get(i)).bark();
			}
			else if(animalHospital.get(i) instanceof Cat)
			{
				((Cat)animalHospital.get(i)).meow();
			}
		}
		
		
		
		
	}

}

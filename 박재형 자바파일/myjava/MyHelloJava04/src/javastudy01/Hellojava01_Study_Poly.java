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
		
		//다형성을 응용한 것
		//조상클래스 타입으로 도니 배열이나 ArrayList에
		//자손클래스 타입의 객체들이 들어간다.
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
		aa.setName("코뿔소");
		
		Dog dd = new Dog();
		dd.setAge(3);
		dd.setName("사월이");
		dd.setHairColor("얼룩무늬색");
		Cat cc = new Cat();
		cc.setAge(2);
		cc.setName("살찐이");
		cc.setEyeColor("노란색");
		
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

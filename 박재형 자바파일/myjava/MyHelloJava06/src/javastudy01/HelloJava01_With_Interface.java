package javastudy01;

import java.util.ArrayList;
import java.util.List;

public class HelloJava01_With_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu("레옹");
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		Animalable d = new Animalable() {
			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("멍멍 짖는다.");
			}			
		};
		Plantable myp = new Plantable() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("LG 틔운에서 만든 꽃");
			}
			
		};
		
		Pokemonable g = new Pokemonable() {

			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("구워어어어.");
			}

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("바다속에서 자란다.");
			}

			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("거북거북 손 Death.");
			}
			
		};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		List<Integer> ns = new ArrayList<Integer>();
		
		//try catch 문법 -java, c#에서 자주 쓰임
		//try 로 지정된 부분이 오류가 나면 catch부분으로 넘어가고
		//프로그램이 종료되진 않는다.(try catch 안한 상태서 오류나면 그대로 종료됨)
		
		try {
			//얕은 복사 이슈를 해결할 열쇠 - Cloneable 이라는 인터페이스 활용
			Pikachu pipi = (Pikachu)p.clone();
			pipi.setName("노란뚱땡이");
			System.out.println(p.getName());
			System.out.println(pipi.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		Pikachu pipi = p;
//		pipi.setName("노란뚱땡이");
//		System.out.println(p.getName());
		//p의 이름은 레옹인데 왜 pipi를 노란뚱땡이로 바꾸니 p도 바뀌지?
		//pipi랑 p가 같은 위치를 참조하기 때문이다.(포인터)
		
		
		
		//람다
		//간추린것
		//메소드가 하나 있는 인터페이스에 대해서 가능함
		//익명 클래스를 줄인거
		
		//Plantable의 grow를 오버라이딩 한것
		//이걸 화살표형태로 줄여버린거 =람다
		//lamda
		//메서드가 하나만 있는 인터페이스만 되는듯
		
		Plantable myFlower = ()->{
			System.out.println("무럭무럭 자라나요");
		};
		myFlower.grow();
		
		
		
		
	}

}

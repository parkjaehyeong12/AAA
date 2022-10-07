package javastudy07;

import java.util.ArrayList;

import javastudy03.GameCharacter;

public class HelloJava02_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성
		//다양한 형태를 띌 가능성
		//공식
		//왼쪽부분은 조상클래스 = ㅇ른ㅉ고 부분은 자손 클래스
		//오른쪽 부분 is 왼쪽부분
		
		GameCharacter g = new Novice();
		//g는 조상
		//오른쪽 자손
		
		//Novice is GameCharacter(O)
		//GameCharacter is Novice
		
		//다형성을 활용
		//조상클래스로 하나의 ArrayList를 만듦녀
		ArrayList<GameCharacter> players =
				new ArrayList<GameCharacter>();
		
		//아래와 같이 그 조상클래스를 상속받은 모든 클래스를
		//하나의 배열에 집어넣을 수 있게 된다.
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		
		//players를 활용하기 위해 알아야
		GameCharacter gg = new Magician();
		
		gg.set_Class("대마법사");
		gg.setId("djlee");
		gg.setLevel(250);
		
		//gg은 GameCharacter의 타입을 가지고
		//Magician의 인스턴스를 가진다
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		//gg는 GameCharacter타입이고
		//Magician으로 인스턴스를 만들었지만
		//Novice로 나든 건 아니다. 따라서 이렇게
		//함부로 형변환을 잘못하면 안된다.
		
//		((Novice)gg).setHp(100);
				
		if(gg instanceof Novice) {
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
		}
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
		
		players.add(new Warrior());
		((Novice)players.get(0)).setId("박재형");
		((Novice)players.get(0)).setLevel(100);
		((Novice)players.get(0)).setHp(20);
		((Novice)players.get(0)).sleep();
		
		((Novice)players.get(0)).attack();
		((Novice)players.get(0)).printInfo();
		
		System.out.println();
		
		((Magician)players.get(1)).set_Class("백수");
		((Magician)players.get(1)).setId("도광현");
		((Magician)players.get(1)).setLevel(15);
		((Magician)players.get(1)).setMp(33);
		((Magician)players.get(1)).magicArrow();
		
		System.out.println();
		
		
		((Warrior)players.get(3)).punch();		
		
	
	}

}

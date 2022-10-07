package javastudy07;

import java.util.ArrayList;

import javastudy01.Rectangle;
import javastudy03.GameCharacter;
import javastudy04.Circle;
import javastudy04.Student;
import javastudy05_answer.Cuboid;
import javastudy05_answer.Sphere;

public class HelloJava03_players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GameCharacter> players 
		=new ArrayList<GameCharacter>();
		
		GameCharacter g = new GameCharacter();
		
		g.set_Class("프로그래머");
		g.setId("조코딩");
		g.setLevel(100);
		players.add(g);
		
		Novice n = new Novice();
		n.set_Class("백수");
		n.setHp(10);
		n.setId("흰손");
		n.setLevel(1);
		players.add(n);
		
		GameCharacter m = new Magician();
		m.set_Class("대마법사");
		m.setId("모태솔로이동준");
		m.setLevel(27);
		
		if(m instanceof Magician) {
			Magician temp = (Magician) m;
			temp.setMp(1000);
			
			((Magician)m).setMp(100);
		}
		
		players.add(m);
		
		players.add(new Warrior());
		players.get(players.size()-1).set_Class("키보드전사");
		players.get(players.size()-1).setId("네이버의논객");
		players.get(players.size()-1).setLevel(17);
		
		
		if(players.get(players.size()-1) instanceof Warrior)
		{
			Warrior w = (Warrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			
			//w는 players 안의 4번째 값을 가리키고 있다.
			//그래서 w에서 set하면 players.get(3)의 값이 바뀐다.
		}
		for (GameCharacter gameCharacter : players) {
			gameCharacter.printInfo();
			gameCharacter.attack();
			
			if(gameCharacter instanceof Novice) {
				//Warrior역시 sleep을 호출
				((Novice)gameCharacter).sleep();
				//Warrior 역시 instanceof에 걸릴 수 있기 때문에
				
				if(gameCharacter instanceof Warrior)
					((Warrior)gameCharacter).punch();
			}
			
			else if(gameCharacter instanceof Magician)
				((Magician)gameCharacter).magicArrow();
		}
		
		ArrayList test = new ArrayList();
		test.add(new Warrior());
		test.add(new Student());
		test.add(new Circle(1));
		test.add(new Sphere(1));
		test.add(new Rectangle());
		test.add(new Cuboid());
		test.add(new GameCharacter)();
		test.add(new Magician());
		
		test.add(1);
		test.add("안녕");
		test.add('c');
		
		
	}

}

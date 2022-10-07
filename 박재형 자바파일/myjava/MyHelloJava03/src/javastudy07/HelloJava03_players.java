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
		
		g.set_Class("���α׷���");
		g.setId("���ڵ�");
		g.setLevel(100);
		players.add(g);
		
		Novice n = new Novice();
		n.set_Class("���");
		n.setHp(10);
		n.setId("���");
		n.setLevel(1);
		players.add(n);
		
		GameCharacter m = new Magician();
		m.set_Class("�븶����");
		m.setId("���¼ַ��̵���");
		m.setLevel(27);
		
		if(m instanceof Magician) {
			Magician temp = (Magician) m;
			temp.setMp(1000);
			
			((Magician)m).setMp(100);
		}
		
		players.add(m);
		
		players.add(new Warrior());
		players.get(players.size()-1).set_Class("Ű��������");
		players.get(players.size()-1).setId("���̹��ǳ�");
		players.get(players.size()-1).setLevel(17);
		
		
		if(players.get(players.size()-1) instanceof Warrior)
		{
			Warrior w = (Warrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			
			//w�� players ���� 4��° ���� ����Ű�� �ִ�.
			//�׷��� w���� set�ϸ� players.get(3)�� ���� �ٲ��.
		}
		for (GameCharacter gameCharacter : players) {
			gameCharacter.printInfo();
			gameCharacter.attack();
			
			if(gameCharacter instanceof Novice) {
				//Warrior���� sleep�� ȣ��
				((Novice)gameCharacter).sleep();
				//Warrior ���� instanceof�� �ɸ� �� �ֱ� ������
				
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
		test.add("�ȳ�");
		test.add('c');
		
		
	}

}

package javastudy06;

import java.util.ArrayList;

import javastudy03.GameCharacter;


public class Main {
	public static void main(String[] args) {
		ArrayList<GameCharacter> gc = new ArrayList<GameCharacter>();
		ArrayList<Magician> mc = new ArrayList<Magician>();
		ArrayList<Novice> nc = new ArrayList<Novice>();
		
		gc.add(new GameCharacter("Ÿ���Ŀ�����","��������"));
		
		gc.get(0).setLevel(20);
		
//		GameCharacter gc1 = new GameCharacter("Ÿ���Ŀ�����","��������");
//		gc1.setLevel(30);
		
		for(GameCharacter ss: gc) {
			ss.attack();
//			ss.setLevel(10);
			ss.printInfo();
		}
				
		mc.add(new Magician("���뺸��","�����̸�����"));
		
		for(Magician ss: mc) {
			ss.attack();
			ss.setLevel(100);
			ss.printInfo();
			ss.magicArrow();
		}
		
		nc.add(new Novice("����","������"));
		
		for(Novice ss: nc) {
			ss.attack();
			ss.setLevel(30);
			ss.printInfo();
			ss.sleep();
		}
		
		
	
		
	}
}

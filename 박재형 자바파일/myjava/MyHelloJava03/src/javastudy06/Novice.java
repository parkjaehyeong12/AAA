package javastudy06;

import javastudy03.GameCharacter;

public class Novice extends GameCharacter{
	private int hp;
	public void sleep() {
		System.out.println("코 주무세요");
	}
	public Novice() {
		super();
	}
	public Novice(String id, String _Class) {
		super(id, _Class);
	}
	
}

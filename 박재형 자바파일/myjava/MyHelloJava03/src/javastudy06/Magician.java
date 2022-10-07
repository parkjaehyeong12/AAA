package javastudy06;

import javastudy03.GameCharacter;

public class Magician extends GameCharacter{
	private int mp;
	
	public Magician() {
		super();
	}
	public Magician(String id, String _Class) {
		super(id, _Class);
	}
	public void magicArrow() {
		System.out.println("매직애로우!");
	}
	
}

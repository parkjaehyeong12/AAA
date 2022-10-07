package ½Ç½À;

public class Sushi extends Food {
	private String wasabiBrand;
	
	public Sushi(String w) {
		this.wasabiBrand=w;
	}
	
	public Sushi() {
		
	}

	public String getWasabiBrand() {
		return wasabiBrand;
	}

	public void setWasabiBrand(String wasabiBrand) {
		this.wasabiBrand = wasabiBrand;
	}
	
}

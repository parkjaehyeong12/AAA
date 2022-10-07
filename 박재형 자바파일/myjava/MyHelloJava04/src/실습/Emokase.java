package 실습;

public class Emokase extends Food{
	public void sayEmo() {
		System.out.println("오마카세 먹어요");
	}
	public String choiceMenu(String n) {
		super.setName(n);
		return getName();
	}
}

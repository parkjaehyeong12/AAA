package �ǽ�;

public class Emokase extends Food{
	public void sayEmo() {
		System.out.println("����ī�� �Ծ��");
	}
	public String choiceMenu(String n) {
		super.setName(n);
		return getName();
	}
}

package javastudy07;

//Warrior�� GameCharacter�� �ڼ��� �ڼ�Ŭ����
public class Warrior extends Novice{
	private int power;
	
	
	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public void punch() {
		System.out.println(power+"��ŭ�� ����!");
	}
}

package �ǽ�1011_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu();
		p.Charming();
		
		Pikachu Lightchu = new Pikachu () {
			public void Charming() {
				System.out.println("���̶���");
			}
			public void Win() {
				System.out.println("�̰��");
			}
		};
		Lightchu.Charming();
		Squirtle ss = new Squirtle() {
			public void Charming() {
				System.out.println("���");
			}
		};
		ss.Charming();
		
		
	}

}

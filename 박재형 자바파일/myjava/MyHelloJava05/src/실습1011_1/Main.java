package 실습1011_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu();
		p.Charming();
		
		Pikachu Lightchu = new Pikachu () {
			public void Charming() {
				System.out.println("라이라이");
			}
			public void Win() {
				System.out.println("이겼다");
			}
		};
		Lightchu.Charming();
		Squirtle ss = new Squirtle() {
			public void Charming() {
				System.out.println("우왕");
			}
		};
		ss.Charming();
		
		
	}

}

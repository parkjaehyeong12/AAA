package javastudy01;

public interface Animalable {
	public void Charming();
	public default void sleep() { //public 안 쓰고 default만 쓰면 다른 패키지에서 못 쓴다.
		//default 쓰면 굳이 해당 메소드를 구현하지 않아도 된다.
		System.out.println("잠을 잡니다.");
	}
}

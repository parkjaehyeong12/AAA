package 실습1;

public class Godzilla extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("고질라가 쿵쿵");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("고질라가 둥둥");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("고질라가 자유낙하");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("고질라가 폴짝");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("고질라는 안잔다");
	}

}

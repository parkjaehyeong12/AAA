package 실습1;

public class Unicorn extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("유니콘이 두두두두두");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("유니콘이 다그닥다그닥");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("유니콘이 훨훨");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("유니콘이 파닥파닥");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("유니콘 쿨쿨");
	}
	
	public Unicorn(String n, int a) {
		setName(n);
		setAge(a);
	}
	
	public Unicorn() {
		
	}
	

}

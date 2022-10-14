package ½Ç½À1;

public class Dragon extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("µå·¡°ïÀÌ ÂÉ·Î·Ï");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("µå·¡°ïÀÌ »ç»Ó»ç»Ó");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("µå·¡°ïÀÌ ÆÈÀÛÆÈÀÛ");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("µå·¡°ïÀÌ ³©³©");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("µå·¡°ïÀÌ ÄğÄğÄğ");
	}

}

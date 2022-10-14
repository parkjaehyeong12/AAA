package javastudy01;

public class Squirtle implements Pokemonable {

	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("꼬북꼬북");
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		return; //이건 식물이 아니니까 아무것도 안함
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("물대포");
	}

}

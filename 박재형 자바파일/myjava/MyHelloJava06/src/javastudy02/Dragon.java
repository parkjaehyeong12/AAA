package javastudy02;

public class Dragon extends Cryptid implements Fliable, Runsable {

	private String species;
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("�巡���� ���� �ʴ´�.");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("�� �ѹ� ���ƺ���");
	}

	@Override
	public void FlatWing() {
		// TODO Auto-generated method stub
		System.out.println("�����ؼ� ���� ����.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�ڴµ� ����� ȥ����.");
	}
	
	public void polymorph() {
		System.out.println(species+"�巡���� ����~");
	}
}

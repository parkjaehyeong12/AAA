package �ǽ�1;

public class Unicorn extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("�������� �εεεε�");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("�������� �ٱ״ڴٱ״�");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("�������� ����");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Ĵ��Ĵ�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}
	
	public Unicorn(String n, int a) {
		setName(n);
		setAge(a);
	}
	
	public Unicorn() {
		
	}
	

}

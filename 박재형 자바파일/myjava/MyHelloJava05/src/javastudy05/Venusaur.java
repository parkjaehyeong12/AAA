package javastudy05;

public class Venusaur extends Ivysaur {
	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("�ɲ� �̻��ز�");
	}
	
	@Override
	public void Grow() {
		// TODO Auto-generated method stub
		System.out.println("����� ���ڶ�");
	}
	
	@Override
	public void Move() {
		// TODO Auto-generated method stub
		super.Run();
		System.out.println("��� ¡�׷���.");
	}
}

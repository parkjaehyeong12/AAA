package javastudy01;

public interface Animalable {
	public void Charming();
	public default void sleep() { //public �� ���� default�� ���� �ٸ� ��Ű������ �� ����.
		//default ���� ���� �ش� �޼ҵ带 �������� �ʾƵ� �ȴ�.
		System.out.println("���� ��ϴ�.");
	}
}

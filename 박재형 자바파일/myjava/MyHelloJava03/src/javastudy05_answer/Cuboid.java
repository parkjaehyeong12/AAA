package javastudy05_answer;

import javastudy01.Rectangle;

public class Cuboid extends Rectangle {
	// ������ ȣ���ϰ� �Ǹ�
	// ���� ���� ���� �ʾƵ� �θ� Ŭ������ �����ڸ� ������ ȣ���Ѵ�.
	public Cuboid() {
		// super(); //�̷������� ��������� ���� �ʾƵ�
		// super <-�� �ڵ尡 �Ϲ������� �� ��
		System.out.println("�����ߴٰ�!");
	}

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid cb1 = new Cuboid();
	}

	public int getCuboidVolume() {
		return getW() * getH() * z;
	}
}

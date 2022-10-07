package javastudy05_answer;

import javastudy01.Rectangle;

public class Cuboid extends Rectangle {
	// 생성자 호출하게 되면
	// 내가 따로 적지 않아도 부모 클래스의 생성자를 무조건 호출한다.
	public Cuboid() {
		// super(); //이런식으로 명시적으로 적지 않아도
		// super <-이 코드가 암묵적으로 들어간 것
		System.out.println("생성했다고!");
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

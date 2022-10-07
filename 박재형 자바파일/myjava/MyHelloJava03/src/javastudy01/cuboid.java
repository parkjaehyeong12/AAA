package javastudy01;

public class cuboid extends Rectangle{
	private int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getCuvoidVloume() {
		return getH()*getW()*getZ();
	}
}

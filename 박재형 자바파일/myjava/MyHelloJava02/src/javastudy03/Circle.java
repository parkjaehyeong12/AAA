package javastudy03;

public class Circle {
	private int r;
	private final double pi =3.14;
	
	
	public int getR() {
		return r;
	}


	public void setR(int r) {
		if(r<0) {
			System.out.println("¿À·ù!");
		}
		else
		this.r = r;
	}
	
//	public void se(double pi) {
//		this.pi = pi;
//	}


	public double getPi() {
		return pi;
	}


	public Circle() {
		System.out.println(pi);
	}
	
	
}

package 실습;

public class Ractangle {
	private int w, h;

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
     public Ractangle() {
    	 
     }
	
	public Ractangle(int w, int h) {
		setH(h);
		setW(w);
	}
	
	public int getArea() {
		if(w==0||h==0) {
			System.out.println("오류입니다.");
			return -1;
		}
		else if(w==h) {
			System.out.println("정사각형입니다.");
			return this.h*this.w;
		}
		else
			return this.h*this.w;
	}
	
	
}

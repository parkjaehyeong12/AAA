package javastudy01;

public class Square {
	private int wh;

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		if(wh<=0)
		{
			System.out.println("잘못된값");
			this.wh=0;
			return;
		}
		this.wh = wh;
	}
	public Square() {
		
	}
	public Square(int wh) {
//		if(wh<0) {
//			System.out.println("잘못된 값");
//			
//		}
//		
//		this.wh=wh;
		//난 이렇게 생각했는데,
		setWh(wh);
		
	}
	//매개변수가 다르고 이름은 같은 생성자나 메서드 여러개를 만드는 것을
	//오버로딩이라 한다.
	
	
}

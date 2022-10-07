package javastudy05;

public class Venusaur extends Ivysaur {
	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("²É²É ÀÌ»óÇØ²É");
	}
	
	@Override
	public void Grow() {
		// TODO Auto-generated method stub
		System.out.println("µîµû¸® ²ÉÀÚ¶÷");
	}
	
	@Override
	public void Move() {
		// TODO Auto-generated method stub
		super.Run();
		System.out.println("¾îµò°¡ Â¡±×·´´Ù.");
	}
}

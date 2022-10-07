package javastudy04;

public class sphere extends Circle {
	
	
	public double getvolume(){
		return (4/3)*getPI()*getR()*getR()*getR();
	}
}

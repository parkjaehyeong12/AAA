package javastudy01;

public class Square {
	private int wh;

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		if(wh<=0)
		{
			System.out.println("�߸��Ȱ�");
			this.wh=0;
			return;
		}
		this.wh = wh;
	}
	public Square() {
		
	}
	public Square(int wh) {
//		if(wh<0) {
//			System.out.println("�߸��� ��");
//			
//		}
//		
//		this.wh=wh;
		//�� �̷��� �����ߴµ�,
		setWh(wh);
		
	}
	//�Ű������� �ٸ��� �̸��� ���� �����ڳ� �޼��� �������� ����� ����
	//�����ε��̶� �Ѵ�.
	
	
}

package javastudy01;

public class HelloJava03_ThrowError {

	//s�ܺ��� e�ܱ��� ������ ���
	//throw Exception : �� �޼ҵ�� ������ �߻��� ���� �ִ�.
	public static void mul(int s, int e) throws Exception {
		if(s>e)
			throw new Exception("�߸��� �Ű�����! s�� �� ŭ");
		
		for(int i = s; i<=e; i++)
		{
			for(int j =1; j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mul(2,9);
			mul(9,2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		mul(9,2);
		
	}

}

package javastudy01;

public class HelloJava04_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally ��ħ��
		//try catch ��������
		//catch ���� �������� �ϵ� ���� finally �κ��� �ݵ�� ����
		int a=0,b=0,c=0,d=0;
		try {
			a=10;
			c=a/b;
		} catch (Exception e) {
			System.out.println("�߸���");
//			int aa = 10;
//			int bb = 0;
//			System.out.println(aa/bb);
			return;//���α׷� ����
		}finally {
			System.out.println("�� �κ� ���� �ȵɼ��� �ִ�.");		
			//DB �����ϴ� ���������� ������ ������ ���ܻ����
			//finally �κп� DB ���� ���� �ڵ带 �Է���
			//�׷��� ��������� �ٷ� DB ���� ������ ���� �� �ֵ��� �Ѵ�.
			//catch�� �ŷ��� �� �κ��� ������ ������
		}
		System.out.println("���� �ȵ�");
		
		
	}

}

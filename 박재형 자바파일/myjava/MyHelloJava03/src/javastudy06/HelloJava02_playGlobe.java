package javastudy06;

public class HelloJava02_playGlobe {
	public static void main(String[] args) {
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("�Ķ���");
		g1.setColor("���");
		System.out.println(g1.getColor());
		
		//Color, spin�� protected��
		//Sphere�� ����� Ŭ�����̰ų�
		//Sphere�� ���� ������ �ִ� Ŭ����������
		//������ ������
		//g1.Color //x
		//g1.spin() //x
		
		//private �ڱ� Ŭ���� ���θ�
		//default �ڱ� ��Ű��
		//protected �ڱ� ��Ű�� + ���(���� �ٸ� ��Ű���� �� Ŭ����)����
		//public ��� ��Ű��, �����, ���
	}
}

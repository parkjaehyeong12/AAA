package javastudy01;

public class PorkCutlet extends Food {

	public PorkCutlet(String name, int price) {
		super(name, price);

	}

	@Override
	// �������̵� = ����°� //����Ŭ������ ���� �̸��� �޼ҵ带 �ҷ��´�.�ű⿡ ����°�
	//���� ����� �ʴ´ٸ� �ڽ��� �ڽ��� �޼��带 �� �켱���Ѵ�.
	
	// Food������ eat�� �ƴ϶� ���� �ٸ� eat�� ����� �� �� �ִ�.
	// �����ε����� �ٸ���. �����ε��� �Ű������� �ٸ� ���� �̸��� �޼ҵ��
	
	public void eat() {
		//	super.eat(); //����Ŭ������ eat�� ȣ���ϴ°�.
		System.out.println(getName() + "�� �ְ��� ���");
		System.out.println(getPrice() + "���� ������ �Ʊ��� �ʳ�");	
	}
	//�Ʒ��� �����ε�
	public void eat(int count ) {
		System.out.println(count+"�� ��� ����");
	}
	public void eat (String source) {
		System.out.println(source+"�ҽ��� ���Դ�");
	}
	
	
	
	
}

package javastudy03;

import javastudy06.Magician;

public class GameCharacter {
	private String Id;// ĳ���� ���̵�
	private String _Class;// ĳ���� Ŭ����
	private int Level;// ĳ���� ����/
//	protected int Level;
	
	private static int Count;// ���� �� �ο���
	// �ش� ������ �� �ο��� int ������ �����ÿ� 0

	public GameCharacter(String id, String _Class) {
		Id = id;
		Count++; // ĳ���� �����Ǹ鼭 �� �ο��� �þ��.
		this._Class = _Class;
	}

	public GameCharacter() {
		Count++; // ĳ���� �����Ǹ鼭 �� �ο��� �þ��.
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String get_Class() {
		return _Class;
	}

	public void set_Class(String _Class) {
		this._Class = _Class;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	// �� �ο����� ���Ƿ� �ǵ帱 �� ���� ��
	// �� �ο����� �о���� ���� �ְ�
	// ���� �߰��� ���� �þ
	public static int getCount() {
		return Count;
	}

	public static void sayHello() {
		System.out.println("�ȳ�~");
	}

	public void attack() {
		if (_Class.contains("����")) {
			System.out.println("��������");
		} else if (_Class.contains("������")) {
			System.out.println("��������");
		} else {
			System.out.println(Level + " lv " + _Class + "�� ������");
		}
	}
	
	public void printInfo() {
		System.out.println(this.Id+"�� ������ "+this._Class);
		System.out.println("Lv: "+this.Level);
	}

	
	
}

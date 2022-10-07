package javastudy03;

import javastudy06.Magician;

public class GameCharacter {
	private String Id;// 캐릭터 아이디
	private String _Class;// 캐릭터 클래스
	private int Level;// 캐릭터 레벨/
//	protected int Level;
	
	private static int Count;// 게임 총 인원수
	// 해당 게임의 총 인원수 int 변수는 선언당시에 0

	public GameCharacter(String id, String _Class) {
		Id = id;
		Count++; // 캐릭터 생성되면서 총 인원이 늘어난다.
		this._Class = _Class;
	}

	public GameCharacter() {
		Count++; // 캐릭터 생성되면서 총 인원이 늘어난다.
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

	// 총 인원수는 임의로 건드릴 수 없게 됨
	// 총 인원수는 읽어들일 수만 있고
	// 유저 추가할 때만 늘어남
	public static int getCount() {
		return Count;
	}

	public static void sayHello() {
		System.out.println("안녕~");
	}

	public void attack() {
		if (_Class.contains("전사")) {
			System.out.println("물리어택");
		} else if (_Class.contains("마법사")) {
			System.out.println("마법공격");
		} else {
			System.out.println(Level + " lv " + _Class + "의 때리기");
		}
	}
	
	public void printInfo() {
		System.out.println(this.Id+"의 직업은 "+this._Class);
		System.out.println("Lv: "+this.Level);
	}

	
	
}

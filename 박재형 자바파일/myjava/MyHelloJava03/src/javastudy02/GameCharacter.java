package javastudy02;

public class GameCharacter {
	private String id;
	private String job;
	private int level;
	private static String hello ="�ȳ�~";
	private static int c_num = 0;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public GameCharacter(String id, String job) {
		this.id = id;
		this.job = job;		
		c_num++;
	}
	
//	public static void sayWarrior() {
//		System.out.println("��������");
//	}
//	public static void sayMagician() {
//		System.out.println("���� ����");
//	}
	
	public String getAttack() {
		if(this.job=="����") {
			return "��������";
		}
		else if(this.job=="������") {
			return "���� ����";
		}
		else
			return "��������";
	}
	
	public String getHello() {
		return hello;
	}
	
	public int getCNum() {
		return c_num; 
	}
	
	
	
}

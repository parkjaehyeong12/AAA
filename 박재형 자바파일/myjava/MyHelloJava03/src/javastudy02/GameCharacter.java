package javastudy02;

public class GameCharacter {
	private String id;
	private String job;
	private int level;
	private static String hello ="안녕~";
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
//		System.out.println("물리어택");
//	}
//	public static void sayMagician() {
//		System.out.println("마법 공격");
//	}
	
	public String getAttack() {
		if(this.job=="전사") {
			return "물리어택";
		}
		else if(this.job=="마법사") {
			return "마법 공격";
		}
		else
			return "날라차기";
	}
	
	public String getHello() {
		return hello;
	}
	
	public int getCNum() {
		return c_num; 
	}
	
	
	
}

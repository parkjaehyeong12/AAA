package javastudy02;

public class Main2 {

	public static void main(String[] args) {
		
		GameCharacter id1 = new GameCharacter("타락파워전사","전사");
		System.out.println(id1.getCNum()+" "+id1.getAttack()+" "+id1.getHello());
		
		GameCharacter id2 = new GameCharacter("싸비","마법사");
		System.out.println(id2.getCNum()+" "+id2.getAttack()+" "+id2.getHello());
		
		GameCharacter id3 = new GameCharacter("캡박재형","해적");
		System.out.println(id3.getCNum()+" "+id3.getAttack()+" "+id3.getHello());
		
		
	}
}

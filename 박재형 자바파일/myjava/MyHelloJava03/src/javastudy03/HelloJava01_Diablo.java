package javastudy03;
import java.util.ArrayList;
import java.util.Scanner;


public class HelloJava01_Diablo {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("총 인원 "+GameCharacter.getCount());
		
		GameCharacter g1 = new GameCharacter();		
		g1.set_Class("핑크전사");
		g1.setId("핑크퐁크재형");
		System.out.println("총 인원 "+GameCharacter.getCount());		
	
		
		GameCharacter g2 = new GameCharacter("최강김혜민","야구마법사");
		System.out.println("총 인원 "+GameCharacter.getCount());
		
		
		GameCharacter g3 = new GameCharacter();
		g3.set_Class("직훈교사");
		g3.setId("에러메시지좀보라고");
		g3.setLevel(34);
		System.out.println("총 인원 "+GameCharacter.getCount());
		
		
		GameCharacter.sayHello();
		g1.attack();
		g2.attack();
		g3.attack();
		
		
		System.out.println("몇칸짜리 배열?");
		
		GameCharacter[] arr1 = new GameCharacter [s.nextInt()];
		arr1[0]= new GameCharacter(s.next(),s.next());
		arr1[1] = new GameCharacter(s.next(),s.next());
		
		ArrayList<GameCharacter> arr2
		=new ArrayList<GameCharacter>();
		
		arr2.add(new GameCharacter(s.next(),s.next()));
		arr2.add(new GameCharacter(s.next(),s.next()));

		
		
		
	}
}

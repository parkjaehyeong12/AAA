package javastudy03;
import java.util.ArrayList;
import java.util.Scanner;


public class HelloJava01_Diablo {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� �ο� "+GameCharacter.getCount());
		
		GameCharacter g1 = new GameCharacter();		
		g1.set_Class("��ũ����");
		g1.setId("��ũ��ũ����");
		System.out.println("�� �ο� "+GameCharacter.getCount());		
	
		
		GameCharacter g2 = new GameCharacter("�ְ�������","�߱�������");
		System.out.println("�� �ο� "+GameCharacter.getCount());
		
		
		GameCharacter g3 = new GameCharacter();
		g3.set_Class("���Ʊ���");
		g3.setId("�����޽����������");
		g3.setLevel(34);
		System.out.println("�� �ο� "+GameCharacter.getCount());
		
		
		GameCharacter.sayHello();
		g1.attack();
		g2.attack();
		g3.attack();
		
		
		System.out.println("��ĭ¥�� �迭?");
		
		GameCharacter[] arr1 = new GameCharacter [s.nextInt()];
		arr1[0]= new GameCharacter(s.next(),s.next());
		arr1[1] = new GameCharacter(s.next(),s.next());
		
		ArrayList<GameCharacter> arr2
		=new ArrayList<GameCharacter>();
		
		arr2.add(new GameCharacter(s.next(),s.next()));
		arr2.add(new GameCharacter(s.next(),s.next()));

		
		
		
	}
}

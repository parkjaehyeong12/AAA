package javastudy01;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloJava01_Restaurant {
	public static void main(String[] args) {
		Food f = new Food("�����");
		Sushi s = new Sushi("�����ʹ�",10000,"����ͻ��");
		Food e = new Emokase("��â����",20000);
	
		
		ArrayList<Food> foods = new ArrayList<Food>();
		f.setPrice(1000);
		foods.add(f);
		foods.add(s);
		foods.add(e);
		
		//Scanner�� ���ٽ��� Ŭ����
		//�����ڵ� �ְ� �Ű������� �ִ�.
		//System Ŭ���� �ȿ� �ִ� in�� Ŭ���� ����
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("� ���� �߰��ҷ�?");
			String name = scan.nextLine();
			Food temp;
			
			if(name.equals("����")||name.equals("Sushi")) {
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("���� �ʹ�?");
				String Sushiname = scan.nextLine();
				System.out.println("���� �ͻ���?");
				String wasabi = scan.nextLine();
				temp = new Sushi(Sushiname, price, wasabi);
				foods.add(temp);
			}
			
			else if(name.equals("�̸�ī��")||name.equals("Emokase")) {
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("�޴����� ����?");
				String menu = scan.nextLine();
				temp = new Emokase(menu, price);
				foods.add(temp);
			}
			else {
				if(name.equals("exit")) {
					break;
				} else {
					System.out.println("�󸶾�?");
					int price = scan.nextInt();
					scan.nextLine();
					System.out.println("�޴����� ����?");
					String menu = scan.nextLine();
					temp = new Food(menu, price);
					foods.add(temp);
				}
				
			}
		
			
//			System.out.println("�׸� �߰��ҷ�?");
//			String choice = scan.nextLine();
//			
//			if(choice.contains("yes")||choice.contains("y"))
//			{
//				for (Food food : foods) {
//					if(food instanceof Sushi) {
//						((Sushi)food).eat();
//					}
//					else if(food instanceof Emokase) {
//						((Emokase)food).choiceMenu("�����");
//					}
//				}
//				break;
//			}		
		}
		for(Food food:foods) {
			food.eat();
			if(food instanceof Emokase)
			{
				((Emokase)food).sayEmo();
//				System.out.println("�޴�?");
//				String menu = scan.nextLine();
//				System.out.println
//				(((Emokase)food).choiceMenu(menu));
			}
//			else if(food instanceof Sushi)
//			{
//				((Sushi)food).setWasabiBrand("û�����");
//			}
		}
		
	}
}

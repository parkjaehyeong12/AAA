package javastudy01;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloJava01_Restaurant {
	public static void main(String[] args) {
		Food f = new Food("비빔밥");
		Sushi s = new Sushi("연어초밥",10000,"녹색와사비");
		Food e = new Emokase("곱창전골",20000);
	
		
		ArrayList<Food> foods = new ArrayList<Food>();
		f.setPrice(1000);
		foods.add(f);
		foods.add(s);
		foods.add(e);
		
		//Scanner도 보다시피 클래스
		//생성자도 있고 매개변수도 있다.
		//System 클래스 안에 있는 in은 클래스 변수
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("어떤 음식 추가할래?");
			String name = scan.nextLine();
			Food temp;
			
			if(name.equals("스시")||name.equals("Sushi")) {
				System.out.println("얼마야?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("무슨 초밥?");
				String Sushiname = scan.nextLine();
				System.out.println("무슨 와사비써?");
				String wasabi = scan.nextLine();
				temp = new Sushi(Sushiname, price, wasabi);
				foods.add(temp);
			}
			
			else if(name.equals("이모카세")||name.equals("Emokase")) {
				System.out.println("얼마야?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("메뉴명이 뭐야?");
				String menu = scan.nextLine();
				temp = new Emokase(menu, price);
				foods.add(temp);
			}
			else {
				if(name.equals("exit")) {
					break;
				} else {
					System.out.println("얼마야?");
					int price = scan.nextInt();
					scan.nextLine();
					System.out.println("메뉴명이 뭐야?");
					String menu = scan.nextLine();
					temp = new Food(menu, price);
					foods.add(temp);
				}
				
			}
		
			
//			System.out.println("그만 추가할래?");
//			String choice = scan.nextLine();
//			
//			if(choice.contains("yes")||choice.contains("y"))
//			{
//				for (Food food : foods) {
//					if(food instanceof Sushi) {
//						((Sushi)food).eat();
//					}
//					else if(food instanceof Emokase) {
//						((Emokase)food).choiceMenu("된장찌개");
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
//				System.out.println("메뉴?");
//				String menu = scan.nextLine();
//				System.out.println
//				(((Emokase)food).choiceMenu(menu));
			}
//			else if(food instanceof Sushi)
//			{
//				((Sushi)food).setWasabiBrand("청양고추");
//			}
		}
		
	}
}

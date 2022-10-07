package 실습;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Food f1 = new Food("돼지국밥", 6000);
		Sushi s1 = new Sushi("청양고추 와사비");
		Emokase e1 = new Emokase();

		ArrayList<Food> arr = new ArrayList<Food>();
		arr.add(f1);
		arr.add(s1);
		arr.add(e1);

		for (Food food : arr) {
			food.setName("된장찌개");
			food.setPrice(1000);

			food.eat();

			if (food instanceof Sushi) {
				System.out.println(((Sushi) food).getWasabiBrand());
			} else if (food instanceof Emokase) {
				System.out.println(((Emokase) food).choiceMenu("소고기 오마카세"));
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) {
			Food f2 = new Food();
			Emokase e2 = new Emokase();
			Sushi s2 = new Sushi();
			arr.add(f2);
			arr.add(e2);
			arr.add(s2);
		}
		int choice = 0;
		for(int i = 0; i<3 ; i++) {
			if(choice==0) {
				arr.add(new Food());
				Food f = arr.get(arr.size()-1);
				f.setName("소불고기");
				f.setPrice(2500);
			} else if(choice == 1) {
				arr.add(new Sushi());
				Food s = arr.get(arr.size()-1);
				((Sushi)s).setWasabiBrand("하바네로 와사비");
				
			} else {
				arr.add(new Emokase());
				Food e = arr.get(arr.size()-1);
				((Emokase)e).choiceMenu("짜장면");
			}
		}
		
		

	}

}

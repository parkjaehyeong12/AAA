package �ǽ�;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Food f1 = new Food("��������", 6000);
		Sushi s1 = new Sushi("û����� �ͻ��");
		Emokase e1 = new Emokase();

		ArrayList<Food> arr = new ArrayList<Food>();
		arr.add(f1);
		arr.add(s1);
		arr.add(e1);

		for (Food food : arr) {
			food.setName("�����");
			food.setPrice(1000);

			food.eat();

			if (food instanceof Sushi) {
				System.out.println(((Sushi) food).getWasabiBrand());
			} else if (food instanceof Emokase) {
				System.out.println(((Emokase) food).choiceMenu("�Ұ�� ����ī��"));
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
				f.setName("�ҺҰ��");
				f.setPrice(2500);
			} else if(choice == 1) {
				arr.add(new Sushi());
				Food s = arr.get(arr.size()-1);
				((Sushi)s).setWasabiBrand("�Ϲٳ׷� �ͻ��");
				
			} else {
				arr.add(new Emokase());
				Food e = arr.get(arr.size()-1);
				((Emokase)e).choiceMenu("¥���");
			}
		}
		
		

	}

}

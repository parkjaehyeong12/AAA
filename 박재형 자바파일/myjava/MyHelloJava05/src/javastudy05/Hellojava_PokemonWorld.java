package javastudy05;

import java.util.ArrayList;

public class Hellojava_PokemonWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulbasaur b = new Bulbasaur ();
		Bulbasaur i = new Ivysaur ();//������ Ȱ�뵵 �ȴ�.
		Venusaur v = new Venusaur();
		
		
		Animalable p = new Animalable() {
			@Override
			public void Move() {
				// TODO Auto-generated method stub
				System.out.println("������ �پ��.");
			}
			@Override
			public void Run() {
				// TODO Auto-generated method stub
				System.out.println("��¦��¦");
			}
			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("��ī��");
			}
		};
		
		 ArrayList <Animalable> pokemons
		 = new ArrayList<Animalable>();
		 pokemons.add(b);
		 pokemons.add(i);
		 pokemons.add(v);
		 pokemons.add(p);
		 
		 Venusaur megaVenu = new Venusaur() {
			public void Grow() {
				System.out.println("�ɸ�� ������ �ڶ���.");
			}
			public void Charming() {
				System.out.println("�̻���~��");
			}
		 };
		 
		 for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
		
		 
		 
		 
		 
		 
	}

}

package javastudy05;

import java.util.ArrayList;

public class Hellojava_PokemonWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulbasaur b = new Bulbasaur ();
		Bulbasaur i = new Ivysaur ();//다형성 활용도 된다.
		Venusaur v = new Venusaur();
		
		
		Animalable p = new Animalable() {
			@Override
			public void Move() {
				// TODO Auto-generated method stub
				System.out.println("빠르게 뛰어간다.");
			}
			@Override
			public void Run() {
				// TODO Auto-generated method stub
				System.out.println("폴짝폴짝");
			}
			@Override
			public void Charming() {
				// TODO Auto-generated method stub
				System.out.println("피카츄");
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
				System.out.println("꽃모양 나무가 자란다.");
			}
			public void Charming() {
				System.out.println("이상해~꽃");
			}
		 };
		 
		 for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
		
		 
		 
		 
		 
		 
	}

}

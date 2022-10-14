package javastudy01;

public class Pikachu implements Animalable , Cloneable{
	//인터페이스 Cloneable 적고, 그 다음에 clone 오버라이딩 하기
	//다른 패키지에서도 모두 활용하려면 protected를 public으로 바꾸기
	//Cloneable의 clone 메소는 이미 default로 구현되어 있으나,
	//오버라이딩을 해야 쓸 수 있다.
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public Pikachu(String name) {
		Name = name;
	}

	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("피카피카");
	}

}

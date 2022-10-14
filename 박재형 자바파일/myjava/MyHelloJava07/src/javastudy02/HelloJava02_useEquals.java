package javastudy02;

public class HelloJava02_useEquals {

	public static void main(String[] args) {
		String a = "이동준";
		String b = "이동준";
		String c = new String("김보규");
		String d = new String("김보규");
		//c와 d는 데이터는 같지만 다른 위치를 가리킴. 즉 동명이인
		//c는 대구 김보규 d는 부산 김보규
		//Equals는 이름만 딱 비교
		Student s1 = new Student("이동준", 340);
		Student s2 = new Student("이동준", 340);

		System.out.println(a == b);//t
		System.out.println(c == d);//f, c와 d가 다른 '곳을' 참조
		System.out.println(s1 == s2);//f

		System.out.println(a.equals(b));//t
		System.out.println(c.equals(d));//t
		
		//다르게 나오는 이유는
		//s1과 s2가 다른 곳을 참조하기 때문에
		//Object클래스에서는 equals할때 hash코드를 비교(고유값0
		
		//s1과 s2를 비교할때는 값만 가지고 비교하게 해야 한다.
		System.out.println(s1.equals(s2));//f
		
		
		Worker w1 = new Worker("박지호","001");
		Worker w2 = new Worker("박지호","001");
		Worker w3 = new Worker("박지호","002");
		
		System.out.println(w1.equals(w2));
		System.out.println(w2.equals(w3));
	}

}

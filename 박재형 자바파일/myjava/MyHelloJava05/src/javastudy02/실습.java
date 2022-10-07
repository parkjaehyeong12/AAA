package javastudy02;

public class 실습 {

	public static void main(String[] args) {
		Teacher t1 = new ProgrammingTeacher("이동준","컴퓨터공학");
		Teacher t2 = new MathTeacher("삽자루","사랑의 매");
		Teacher t3 = new JavaProgrammingTeacher("자바자바","잡아");
		
		ProgrammingTeacher p1 = new ProgrammingTeacher("이동준","컴퓨터공학");
		ProgrammingTeacher p2 = new JavaProgrammingTeacher("자바자바","잡아");
		
		MathTeacher m1 = new MathTeacher("삽자루","사랑의 매");
		
		t1.Teach();
		t2.Teach();
		t3.Teach();
		
		p1.Teach();
		p2.Teach();
		
		m1.Teach();
		
		System.out.println();
		
		//익명
		Teacher temp = new Teacher() {
			public void Teach() {
			 System.out.println("저는 익명의 사람입니다. 제가 누구일까요");	
			}
			public void check() {
				System.out.println("우와");
			}
		};
		temp.Teach();
//		temp.check(); //얘는 안된다.
		
		System.out.println();
		
		LeagueOfLegends lol1 = new DrMundo();
		LeagueOfLegends lol2 = new Malphite();
		
		DrMundo lol3 = new DrMundo();
		Malphite lol4 = new Malphite();
		
		lol1.Q();
		lol1.W();
		lol1.E();
		lol1.R();
		
		lol2.Q();
		lol2.W();
		lol2.E();
		lol2.R();
		
		lol3.Q();
		lol3.W();
		lol3.E();
		lol3.R();
		
		lol4.Q();
		lol4.W();
		lol4.E();
		lol4.R();
		
		LeagueOfLegends Lulu = new LeagueOfLegends() {

			@Override
			public void Q() {
				// TODO Auto-generated method stub
				System.out.println("반짝반짝 창");
			}
			@Override
			public void W() {
				// TODO Auto-generated method stub
				System.out.println("변덕쟁이");
			}
			@Override
			public void E() {
				// TODO Auto-generated method stub
				System.out.println("도와줘, 픽스!");
			}
			@Override
			public void R() {
				// TODO Auto-generated method stub
				System.out.println("급성장");
			}			
		};
		Lulu.Q();
		Lulu.W();
		Lulu.E();
		Lulu.R();
		

	}

}

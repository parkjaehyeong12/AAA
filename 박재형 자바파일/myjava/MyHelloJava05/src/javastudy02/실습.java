package javastudy02;

public class �ǽ� {

	public static void main(String[] args) {
		Teacher t1 = new ProgrammingTeacher("�̵���","��ǻ�Ͱ���");
		Teacher t2 = new MathTeacher("���ڷ�","����� ��");
		Teacher t3 = new JavaProgrammingTeacher("�ڹ��ڹ�","���");
		
		ProgrammingTeacher p1 = new ProgrammingTeacher("�̵���","��ǻ�Ͱ���");
		ProgrammingTeacher p2 = new JavaProgrammingTeacher("�ڹ��ڹ�","���");
		
		MathTeacher m1 = new MathTeacher("���ڷ�","����� ��");
		
		t1.Teach();
		t2.Teach();
		t3.Teach();
		
		p1.Teach();
		p2.Teach();
		
		m1.Teach();
		
		System.out.println();
		
		//�͸�
		Teacher temp = new Teacher() {
			public void Teach() {
			 System.out.println("���� �͸��� ����Դϴ�. ���� �����ϱ��");	
			}
			public void check() {
				System.out.println("���");
			}
		};
		temp.Teach();
//		temp.check(); //��� �ȵȴ�.
		
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
				System.out.println("��¦��¦ â");
			}
			@Override
			public void W() {
				// TODO Auto-generated method stub
				System.out.println("��������");
			}
			@Override
			public void E() {
				// TODO Auto-generated method stub
				System.out.println("������, �Ƚ�!");
			}
			@Override
			public void R() {
				// TODO Auto-generated method stub
				System.out.println("�޼���");
			}			
		};
		Lulu.Q();
		Lulu.W();
		Lulu.E();
		Lulu.R();
		

	}

}

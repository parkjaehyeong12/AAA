package javastudy04;

import javastudy01.cuboid;

public class Main {
	public static void main(String[] args) {
		KBStudent kb1 = new KBStudent();
		kb1.setName("박재형");
		kb1.setAge(26);
		kb1.setGender("남");
		kb1.setEducation("초등학생");
		kb1.attend();
		
		sphere s1 = new sphere();
		s1.setR(5);
		s1.setPI(3.0);
		System.out.println(s1.getvolume());
		
		cuboid c1 = new cuboid();
		c1.setH(2);
		c1.setW(3);
		c1.setZ(4);
		System.out.println(c1.getCuvoidVloume());
	}
}

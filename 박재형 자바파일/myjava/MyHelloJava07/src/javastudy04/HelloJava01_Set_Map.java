package javastudy04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import javastudy03.KBStudent;

public class HelloJava01_Set_Map {

	public static void main(String[] args) {
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		
		//Map, Set
		//C#의 dictionary, python dict랑 같은것
		//Map에서 대표적인 것은 Hash Map
		Map<Integer, String> students 
		= new HashMap <Integer,String>();
		
		students.put(1, "안서준");
		students.put(2, "이동준");
		students.put(1, "박지호"); //키 값이 겹치므로 기본값은 없어짐
		students.put(3, "박지호");
		
		for (int  key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		//hash : 각자를 구분하는 고유값(혹은 고유코드)
		//전화번호나 주민번호같은 것들
		//Set
		//중복을 허용하지 않는 리스트
		
		
		//Set
		//중복을 허용하지 않는 리스트
		
		Set<String> workers = new HashSet<String>();
		workers.add("김진규");
		workers.add("김보규");
		workers.add("김진규");
		workers.add("이동준");
		workers.add("이동준");
		System.out.println("--set Test--");
		for(String string :workers) {
			System.out.println(string);
		}
		javastudy03.KBStudent k1
		= new KBStudent("이현민","남성",30,3);
		javastudy03.KBStudent k2
		= new KBStudent("이현민","남성",30,3);
		
		System.out.println(k1.equals(k2));//번호를 기준으로 비교하면 같다.
		
		Set<KBStudent> kbstudents = new HashSet<KBStudent>();
		
		kbstudents.add(k1);//중복된 값을 집어넣고 있다.
		kbstudents.add(k2);
		for (KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
		
		
		
		
	}

}

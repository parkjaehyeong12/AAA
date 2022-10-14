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
		//C#�� dictionary, python dict�� ������
		//Map���� ��ǥ���� ���� Hash Map
		Map<Integer, String> students 
		= new HashMap <Integer,String>();
		
		students.put(1, "�ȼ���");
		students.put(2, "�̵���");
		students.put(1, "����ȣ"); //Ű ���� ��ġ�Ƿ� �⺻���� ������
		students.put(3, "����ȣ");
		
		for (int  key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		//hash : ���ڸ� �����ϴ� ������(Ȥ�� �����ڵ�)
		//��ȭ��ȣ�� �ֹι�ȣ���� �͵�
		//Set
		//�ߺ��� ������� �ʴ� ����Ʈ
		
		
		//Set
		//�ߺ��� ������� �ʴ� ����Ʈ
		
		Set<String> workers = new HashSet<String>();
		workers.add("������");
		workers.add("�躸��");
		workers.add("������");
		workers.add("�̵���");
		workers.add("�̵���");
		System.out.println("--set Test--");
		for(String string :workers) {
			System.out.println(string);
		}
		javastudy03.KBStudent k1
		= new KBStudent("������","����",30,3);
		javastudy03.KBStudent k2
		= new KBStudent("������","����",30,3);
		
		System.out.println(k1.equals(k2));//��ȣ�� �������� ���ϸ� ����.
		
		Set<KBStudent> kbstudents = new HashSet<KBStudent>();
		
		kbstudents.add(k1);//�ߺ��� ���� ����ְ� �ִ�.
		kbstudents.add(k2);
		for (KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
		
		
		
		
	}

}

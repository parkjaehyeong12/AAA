package javastudy04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloJava02_Testset {

	public static void main(String[] args) {
		
		//HashSet�� ��ü���� ������ hashCode�� �ƴ϶� equals���� �������ؾ� �Ѵ�.
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("�ȼ���","001"));
		employees.add(new Employee("�ȼ���","001"));
		employees.add(new Employee("������","002"));
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
//		Map<String, Employee> myemployees =
//				new HashMap<String, Employee>();
//		myemployees.pu
		
		
	}

}

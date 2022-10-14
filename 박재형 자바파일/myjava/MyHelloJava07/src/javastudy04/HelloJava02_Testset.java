package javastudy04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloJava02_Testset {

	public static void main(String[] args) {
		
		//HashSet을 객체에서 쓰려면 hashCode뿐 아니라 equals까지 재정의해야 한다.
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("안서준","001"));
		employees.add(new Employee("안서준","001"));
		employees.add(new Employee("이현민","002"));
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
//		Map<String, Employee> myemployees =
//				new HashMap<String, Employee>();
//		myemployees.pu
		
		
	}

}

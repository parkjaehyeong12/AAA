package my.hello.javastudy02;
import java.util.ArrayList;
import java.util.Scanner;
public class  Tourist�ǽ� {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("��� �����ұ��?");
		int count = s.nextInt();
		
		Tourist[] students_arr = new Tourist[3];
		
		for(int i =0;i<count;i++) {
			s.nextLine(); 
			System.out.println("�̸�?");
			String name = s.nextLine();
			System.out.println("����?");
			int age = s.nextInt();
			System.out.println("��ȣ?");
			int score = s.nextInt();
			s.nextLine();
			System.out.println("�ֹι�ȣ?");
			String n1 = s.nextLine();
			
			
			
			students_arr[i] =
					new Tourist(name , age , score, n1);
		}
		for(Tourist ss : students_arr) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getBeonho());
			System.out.println(ss.getsNum());
		}
		
//		ArrayList<Student> stu_list
//		=new ArrayList<Student>();
//		
//		for(int i =0;i<count;i++)
//		{
//			s.nextLine();
//			System.out.println("�̸�?");
//			String name = s.nextLine();
//			System.out.println("����?");
//			int age = s.nextInt();
//			System.out.println("����?");
//			double score = s.nextDouble();
//			stu_list.add(new Student(name,age,score));
//		}
//		
//		for(Student ss: stu_list) {
//			System.out.println(ss.getName());
//			System.out.println(ss.getAge());
//			System.out.println(ss.getScore());
//		}
		
	}

}

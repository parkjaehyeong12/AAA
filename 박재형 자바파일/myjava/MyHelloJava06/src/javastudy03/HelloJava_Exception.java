package javastudy03;

import java.util.Scanner;

public class HelloJava_Exception {
	public static void main(String[] args) {
		//�Է��� ���ڿ��� ���ڷ� �ٲٴ� �ΰ��� ���
		//1.nextInt
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է���");
		int num = s.nextInt();
		//�׷��� �̷��� �Է��� ��� ������ nextLine �Է��� �ȵ�
		
		String name = s.nextLine();
		System.out.println("num="+num+",name="+name);
		
		//2.Integer.parseint Ȱ��		
		
		try {
			System.out.println("�ٽ� ���� �Է�");
			int age = Integer.parseInt(s.nextLine());
			
			System.out.println("���ڿ� �Է�");
			String alias = s.nextLine();
			
			System.out.println("age="+age+",alias="+alias);
			
			System.out.println("���ڿ��� ���ڷ� ��ȯ");
			age = Integer.parseInt("�̵���"); //�� �κп��� ������ ����
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("age���� �߸��Ǿ����ϴ�.");
			e.printStackTrace();
			//������ ����ϵ�, �ؿ� �ִ� �ڵ�� �����Ѵ�.
			//�ֳĸ� ����� �� �ƴϰ�, ������ �����ش�. �ڵ������ ��� ����ȴ�.
		}
		System.out.println("��"); //�� �κ��� �������� �ʴ´�.
		
		
	}
}

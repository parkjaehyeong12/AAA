package javastudy01;

import java.util.Scanner;

public class HelloJava02_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch ������ �޸��� ��
		//�� �� �Ʒ����� Exception�� �޷��� ��
		//Ȥ�� Exception�ϰ�, �� �ؿ� Throwable �߰��ؾ� �Ѵ�.
		
		int a=0, b=0, c=0;
		//try catch�� �Ŵµ�, ���ڸ� �߸��Է��� ���
		
		Scanner s = new Scanner(System.in);
		
		try {
			a = 10;
			b = Integer.parseInt(s.nextLine());
			c = a/b;
		}catch(NumberFormatException e) {
			System.out.println("��������(����)"+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("��������(����)"+e.getMessage());
		}catch (Exception e) {
			System.out.println("���� �߸���");
			e.printStackTrace();
		}
		System.out.println("���� c ����? "+c);
		
		
		
		
	}

}

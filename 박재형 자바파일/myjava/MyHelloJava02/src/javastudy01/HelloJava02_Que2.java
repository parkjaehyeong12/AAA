package javastudy01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloJava02_Que2 {

	public static void main(String[] args) {
		// �迭: ũ�Ⱑ �����ǰ� Ư�� �ε����� �� ������
		// ArrayList: ũ�Ⱑ �����Ǿ� ���� ����.
		// ��� ���� �̹� �� �κп� ���ؼ��� �� ���� ����
		// �׸��� Ư���κ� ���� ����. ������ ���� ����.

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// �������̶� �������̽��� �˾ƾ� ���ذ���

		List<Integer> nums = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "��° ���� �Է��ϱ�");
			nums.add(s.nextInt());// �ڹٽ�ũ��Ʈ�� Ǫ�� push �� ����
		}
		
		// foreach ���� ��Ʈ�� �����̽� // �ڵ� ������ ��Ʈ�� ����Ʈ ����

		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		//���� ���ﶩ �� for���� ����.
		//���̰� 5��� 4,5,2,1,0 �̷��� for���� ���ư�
		
		System.out.println("�� �̸��� ���ڸ� ������");
		int cutline=s.nextInt();
		
		for(int i = nums.size()-1;i>=0;i--) {
			if(cutline>nums.get(i)) //get�� i��° ���� �о���°�
				nums.remove(i);//remove�� i��° ����
		}
		nums.set(0, 1); //0��° ���ڸ� 1�� ����
		
		
		//int �� integer �� ����
		for (Integer integer : nums) {
			System.out.println(integer);
		}

	}

}

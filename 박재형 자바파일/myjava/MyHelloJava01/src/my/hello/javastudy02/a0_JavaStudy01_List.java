package my.hello.javastudy02;

import java.util.ArrayList;

public class a0_JavaStudy01_List {
	public static void main(String ars[]) {
		int [] numbers = new int[5];
		
		//���̸� �̸� ������ �ʴ´�, js �迭�� ����
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//���� �Ҵ��غ��°�(�迭)
		numbers[0] =10;
		numbers[1] =30;
		System.out.println("ù��°��: "+numbers[0]);
		
		//���� �߰��ϴ� ��
		nums.add(10); //js�� pushó�� ���ο� ���� �߰���
		//js�� �迭ó�� ������ ��ġ�� ���� �߰����� ����
		nums.add(30);
		
		//Ư�� ��°�� ���� �����غ���
		nums.set(0, 20) ;//ù��° ���� 20���� ����
		System.out.println(nums.get(0));
		
		
		
		//foreach ���� ctrl space �ϸ� ����
		//�迭�� ���̸�ŭ �ݺ����� ����
		//�ݷ�(:) �տ� �ִ� �� �迭 �ȿ� �ִ� ������ҵ�
		for(Integer integer0:numbers) {
			System.out.println(integer0);
		}//�迭�� ���̰� 5. 2,3,4��°���� �⺻���� 0�� ����
		
		//ArrayList = ���� ������ �� �ִ�.
		//�迭�� �� ������ �ȵƴ�...
		
		nums.remove(0); //ù��° �� ����
		nums.add(100);
		nums.add(30); 
		nums.add(30);
		nums.remove((Integer)30); //���� 30�� �� ����
		
		System.out.println("-------------");
		
		
		
		
		for(Integer integer1:nums) {
			System.out.println(integer1);
		}
		
		
	}
}

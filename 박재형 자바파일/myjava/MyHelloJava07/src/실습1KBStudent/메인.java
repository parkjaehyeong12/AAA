package �ǽ�1KBStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		List<KBStudent> stuarr = new ArrayList<KBStudent>();
		System.out.println("�л� ��� �� ���Դϱ�?");
		int n = Integer.parseInt(s.nextLine());
		
		for(int i = 0; i<n;i++) {
			KBStudent k = new KBStudent();
			
			try {
				System.out.println("�л� �̸�?"); //������ 11
				k.setName(s.nextLine());
				System.out.println("�л� ����?");
				k.setGender(s.nextLine());
				
				if(k.getName().matches("[0-9]*"))
				{
					throw new Exception();
				}
				if(k.getGender().matches("[0-9]*"))
				{
					throw new Exception();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				i--;
				System.out.println("�̸�Ȥ�� ������ �������� ó������ �ٽ��Է�^^");
			}
			
				
			System.out.println("�л� ����?");
			k.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("�л� ��ȣ?");
			k.setNumber(Integer.parseInt(s.nextLine()));
			//k.getNumber()==stuarr.get(j).getNumber()
			int a = 0;
			for(int j = 0; j<i;j++) {
				if(k.equals(stuarr.get(j).getNumber())) {
					i--;
					a = 1;
					System.out.println("�� �л��� ���� ������ �ٽ� �Է��Ͻʽÿ�");
					break;
				}
			}
			if(a==0) {
			stuarr.add(k);
			}
		}
		
		Collections.sort(stuarr);
		
		for(int i = 0; i<n; i++) {
			System.out.println(stuarr.get(i).toString());
		}
	
	}
}

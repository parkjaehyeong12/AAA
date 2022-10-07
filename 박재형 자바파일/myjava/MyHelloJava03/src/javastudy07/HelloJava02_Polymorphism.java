package javastudy07;

import java.util.ArrayList;

import javastudy03.GameCharacter;

public class HelloJava02_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		//�پ��� ���¸� �� ���ɼ�
		//����
		//���ʺκ��� ����Ŭ���� = �������� �κ��� �ڼ� Ŭ����
		//������ �κ� is ���ʺκ�
		
		GameCharacter g = new Novice();
		//g�� ����
		//������ �ڼ�
		
		//Novice is GameCharacter(O)
		//GameCharacter is Novice
		
		//�������� Ȱ��
		//����Ŭ������ �ϳ��� ArrayList�� �����
		ArrayList<GameCharacter> players =
				new ArrayList<GameCharacter>();
		
		//�Ʒ��� ���� �� ����Ŭ������ ��ӹ��� ��� Ŭ������
		//�ϳ��� �迭�� ������� �� �ְ� �ȴ�.
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		
		//players�� Ȱ���ϱ� ���� �˾ƾ�
		GameCharacter gg = new Magician();
		
		gg.set_Class("�븶����");
		gg.setId("djlee");
		gg.setLevel(250);
		
		//gg�� GameCharacter�� Ÿ���� ������
		//Magician�� �ν��Ͻ��� ������
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		//gg�� GameCharacterŸ���̰�
		//Magician���� �ν��Ͻ��� ���������
		//Novice�� ���� �� �ƴϴ�. ���� �̷���
		//�Ժη� ����ȯ�� �߸��ϸ� �ȵȴ�.
		
//		((Novice)gg).setHp(100);
				
		if(gg instanceof Novice) {
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
		}
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
		
		players.add(new Warrior());
		((Novice)players.get(0)).setId("������");
		((Novice)players.get(0)).setLevel(100);
		((Novice)players.get(0)).setHp(20);
		((Novice)players.get(0)).sleep();
		
		((Novice)players.get(0)).attack();
		((Novice)players.get(0)).printInfo();
		
		System.out.println();
		
		((Magician)players.get(1)).set_Class("���");
		((Magician)players.get(1)).setId("������");
		((Magician)players.get(1)).setLevel(15);
		((Magician)players.get(1)).setMp(33);
		((Magician)players.get(1)).magicArrow();
		
		System.out.println();
		
		
		((Warrior)players.get(3)).punch();		
		
	
	}

}

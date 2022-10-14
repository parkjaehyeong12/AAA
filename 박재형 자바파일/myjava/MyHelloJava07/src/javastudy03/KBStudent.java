package javastudy03;

public class KBStudent implements Comparable<KBStudent> {
	private String Name;
	private String Gender;
	private int Age;
	private int Number; // �����ͺ��̽����� �⺻Ű �� ����.

	public KBStudent(String name, String gender, int age, int number) {
		Name = name;
		Gender = gender;
		Age = age;
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	@Override
	public String toString() {

		return String.format("�̸�:%s, ����:%s, ����:%d, ��ȣ:%d", Name, Gender, Age, Number);
	}

	// ���ϴ� ������ ���� number���̴�.
	// �ߺ�üũ�� �� ����� �޼ҵ�(contain)���� ����

	@Override
	public boolean equals(Object obj) {

		/*
		 * KBStudent k =(KBStudent)obj; return k.getNumber()==Number;
		 */

		return ((KBStudent) obj).getNumber() == Number;
	}

	@Override
	public int compareTo(KBStudent o) {
		// TODO Auto-generated method stub
		// return 0;
		return Age - o.getAge(); // ��������
	}

}
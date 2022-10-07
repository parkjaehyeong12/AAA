package javastudy03;
//하나의 변수 안에 한 고객의 모든 정보를 집어넣고 싶다면
//C에선 구조체와 같은 사용자 정의 타입 만들고
//자바스크립트에선 객체 혹은 class혹은 function이용해서
//종합적인 타입의 변수를 만들고
//C#이나 Java, C++에선 같인 class를 만들어주면 된다.


public class Customer {
	//고객
	//이름, 나이, 번호
	String name;
	int age;
	String cNum;
	
//	Customer()
//	{} 이렇게 아무것도 없는 것이 쓰여잇음
//	이걸 생성자
//	생성자는 new 키워드의 가이드라인
	
//	생성할때마다 뭔가를 수행하도록 내용을 추가
	public Customer(){
		System.out.println("고객 1명 생성");
	}
	
}

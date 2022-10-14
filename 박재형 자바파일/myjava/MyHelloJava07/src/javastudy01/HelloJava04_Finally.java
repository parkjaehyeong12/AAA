package javastudy01;

public class HelloJava04_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally 마침내
		//try catch 구간에서
		//catch 에서 무슨짓을 하든 간에 finally 부분은 반드시 실행
		int a=0,b=0,c=0,d=0;
		try {
			a=10;
			c=a/b;
		} catch (Exception e) {
			System.out.println("잘못됨");
//			int aa = 10;
//			int bb = 0;
//			System.out.println(aa/bb);
			return;//프로그램 종료
		}finally {
			System.out.println("이 부분 실행 안될수도 있다.");		
			//DB 연결하는 과정에서나 쿼리문 날릴때 예외생기면
			//finally 부분에 DB 접속 끊는 코드를 입력함
			//그래서 문제생기면 바로 DB 부터 무조건 끊을 수 있도록 한다.
			//catch에 거려도 이 부분은 무조건 실행함
		}
		System.out.println("여긴 안됨");
		
		
	}

}

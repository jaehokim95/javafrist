package tjoeun.java1026;

public class DataTypeError {
	public static void main(String[] args) {
		//변소를 생성하고 데이터를 저장한 후 출력
		char ch = 'f' ;
		System.out.println("ch는" + ch + "입니다.");
		
		//아래 문장은 에러 - ch라는 변수를 이미 생성해
		//int ch = 'a' ;
		
		//위의 문제를 해결하는 방법 - 다른 변수를 생성해서 해결
		char character= 'a';
		
		//위의 문제를 해결하는 방법 - 데이터의 종류가 같다면 변수를 재사용
		ch = 'a';
		
		
		//에러 : 변수와 대입되는 자료형이 달라서 에
		//ch = '97.1';
		
		//첫번째 해결 방법은 실수 변수를 만들어서 대입
		//데이터의 손실이 없음
		double d = 97.1;
		
		//두번째 해결 방법은 char로 변경해서 대입
		//소수는 사라짐
		ch = (char)97.1;
		
		
		
		
		
	}

}

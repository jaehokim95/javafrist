package tjoeun.java1026;

public class DataTypeCasting {
	
	public static void main(String[] args) {
		
		double height = 168 ;
		System.out.println("키는" + height + "cm");
		
		//강제 형 변환
		//데이터의 자료형을 변경해서 대입
		//싨를 정수로 변경해서 대입
		//소수는 제거
		int age = (int) 51.7;
	System.out.println("나이는" + age + "입니다");
	
	//표현범위 밖의 숫자를 강제로 변환해서 대입하면
	//overflow나 underflow 발생
	//overflow: 가장 큰 쪽으로 넘어가서 가장 작은 것부터 다시 시작
	//underflow: overflow의 반대
	//byte는 -128~127 까지 표현가능
	
byte b= (byte)128;
System.out.println(b); // 이게 overflow
b= (byte)-256;
System.out.println(b);


	}

}

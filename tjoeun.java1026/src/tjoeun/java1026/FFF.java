package tjoeun.java1026;

public class FFF {
	public static void main(String[] args) {
		
	int result = 10 + 20;
	System.out.println( "result:" + result);
	
	//문자열 + 숫자는 문자열의 결합으로 리턴
	
String str= "10" + 20;
System.out.println("str:"+str);

//10/3은 정수 사이의 연산이므로 결과는 3
//1/2는 0
	
result = 10 / 3 ;
System.out.println("result:" + result);

//정수 / 정수 한 결과를 소수까지 구하고자 하면
//둘 중의 하나의 데이터를 실수로 변경해주어야 합니다.
//정수와 실수가 연산을 하면 정수를 실수로 변환해서 연산을 하기 때문입니다.
		
	System.out.println("result:"+ ((double) 10/3));
	System.out.println("result:"+ ( 10/ (double)3));
		
	
	byte b = 30;
	byte c = 20;
	//산술 연산을 하면 연산의 결과는 최소한 int
	//int는 byte보다 크므로 대입이 안됩니다.
	//int 변수에 결과를 대입하거나 결과를 byte로 형 변환 해야합니다.
    byte d = (byte)(b + c);
    
    //숫자 데이터에서 원하는 결과를 얻고자 할 때는 강 형 변환을 적절히 이용하면 됩니다.
    
    //
    
	
	}

}

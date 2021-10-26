package tjoeun.java1026;

public class Unary {

	public static void main(String[] args) {
		
		int n = 10;
		//~은 1의 보수 - 부호는 반대가되고 절대값은 1이 증가하거나 감소
		//그래픽 프로그램에서 색상 반전에 이
	System.out.println("~n:"+~n);
	
	//!(not) -boolean 데이터 반전
boolean b = true;
System.out.println("!b:"+!b);

n = 10;
//++ n의 값을 1 증가 시킵니다.
//--는 1 감소 시킵니다.
n ++;
System.out.println("n:" + n);

n = 10;

//++나 --가뒤에 붙으면 ++나 --를 하지않고 먼저 사용하고
//나중에 ++나 --를 수행합니다.
System.out.println("n++: " + (n++));

n=10;

System.out.println("++n:" + (++n));

//++와 --는 C계열의 언어에만 존재
//C 언어와 Java는 다르게 동작합니다.

n = 0;
int result = ++n + ++n;
System.out.println("result:" + result);




		
	}
}

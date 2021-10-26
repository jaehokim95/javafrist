package tjoeun.java1026;

public class Test {

	public static void main(String[] args) {
		
		double d = 10.2;
		//d의 값을 소수 첫 째 자리에서 반올림해서 저장
		//강제 형 변환과 사직산을 적절히 이용하면 됩니다.
		//0.5를 더해서 정수로 변환하면 됩니다.
	int result = (int)(d+0.5);
		System.out.println(result);
		
		d = 10.77;
		//소수 둘 째 자리 반올림해서 출력 10.8
	
	System.out.println(((int)(d*10 + 0.5) / 10.0));
	
	int money = 87650;
	//10의 자리에서 반올림해서 출력하기 - 87700
	

	
	}
}

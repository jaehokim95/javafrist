package tjoeun.java1026;

public class Logical {

	public static void main(String[] args) {
	System.out.println(10>3);
	
	int year = 2021;
	//year 가 윤년인지 판별
	//year 가 4의 배수이고 100의 배수가 아니면 윤년
	//또는 400의 배수인 경우
	
	//배수는 그 숫자로 나눈 나머지가 0인 
	
	boolean pan = year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
			if(pan == true) {
				System.out.println("year는 윤년");
			}else {
				System.out.println("year는 윤년이 아님");
			}
			
			//and나 or는 좌우의 식의 순서를 변경해도 결과는 동일
			//1부터 100까지에서 3의 배수이고 4의 배수인 데이터의 개수를 확인
			//&&는 앞의 결과가 false 이면 뒤의 결과를 확인하지 않음
			//||는 앞의 결과가 true 이면 뒤의 결과를 확인하지 않음
			//2가지 방법 중 어떤 것이 좋은지 판
			int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	int x = 10;
	boolean r = x > 5 && x++ > 10;
	System.out.println(x); //x의 값 =?
	
	x = 10;
	r = x <5 && x++ > 10;
	System.out.println(x); //x의 값 =?
	
	}
}

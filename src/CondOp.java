
public class CondOp {

	public static void main (String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		//삼항 연산자
		big = (num1 > num2)? num1 : num2;
		System.out.println(big);
	
		//삼항 연산자의 if문 변환
		
		if (num1 > num2) {
			System.out.println("큰수 : " +num1);
		}
		else
			System.out.println("큰수 : " +num2);
	
	
		// 절대값 출력
		
		if ((num1 - num2) > 0) {
			System.out.println("큰수 : " + (num1 - num2));
		}
		else 
			System.out.println("큰수 : " + -(num1 - num2));
	}
}

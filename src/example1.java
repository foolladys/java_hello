
public class example1 {

	public static void main (String[] args) {
		
		int num1 = 77;
		boolean result;
		
		if(num1%7 == 0 && num1%11 == 0)
			result = true;
		else
			result = false;
		
		System.out.println(num1%2 == 0 && num1%7 == 0 && num1%11 == 0);
		
		
		System.out.println(result);
	
		int number1 = 0;
		int number2 = 0;
		
		result = ((number1 += 10) < 0) && ((number2 += 10) >0);
		
		// AND 연산에서 앞부분이 false면 뒷부분의 복합 대입연산자가 들어간 식은
		// 검사하지 않으므로 값이 대입되지 않는다.
		
		System.out.println("result = " + result);
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		
		// false, 10, 0
		
		result = ((number1 += 10) > 0) && ((number2 += 10) >0);
		System.out.println("result = " + result);
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
	
		// true, 20, 10
	}
	
}

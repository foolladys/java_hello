
public class example2 {

	public static void main(String[] args) {

		
		short num12 = 3;
		short num123 = (short)-num12; // num1 *= -1;
		
		System.out.println(num12);
		System.out.println(num123);
		
		// 증감 연산자
		
		int prefix = 7;
		System.out.println(++prefix); // 8
		System.out.println(++prefix); // 9
		System.out.println(prefix);     // 9
		
		int postpix = 7;
		System.out.println(postpix++); // 7
		System.out.println(postpix++); // 8
		System.out.println(postpix);     // 9
		
		long exam1 = 30000000000L;
		long exam2 = 30000000000L;
		
		long long_result = exam1+exam2;
		System.out.println(long_result);
		//long long_result_2 = 30000000000 + 30000000000;
		//System.out.println(long_result_2);
	}
}

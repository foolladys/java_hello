
public class CompAssignOp {

	public static void main(String[] args)
	{
		
		char ch = 'A';
		short sh = 100;
		
		int result = ch + sh;
		
		System.out.println(result);
		
		//
		
		float fl = 0.1f;
		long l = 10;
		
		float result2 = fl + l;
		// float = result2 = fl + l; (컴파일 에러)
		System.out.println(result2);
		
		//
		double pi = 3.14;
		int num = (int)pi; // 명시적 형변환을 해주지 않으면 컴파일 에러
		System.out.println(num);
		System.out.println(pi);
		
		
		long num1 = 3000000007L;
		int num2 = (int)num1;
		System.out.println(num2);
		
		//
		
		short sh1 = 10;
		char ch1 = 'A';
		short sh2 = 20;
		
		short sh3 = (short) (sh1 + sh2);
		char ch2 = (char) (ch1 + sh1);
		
		System.out.println(sh3);
		System.out.println(ch2);
		
		
		int a = 3;
		int b = 4;
		double c = (double) a/b;
		System.out.println(c);
	}
}

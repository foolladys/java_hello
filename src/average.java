
public class average {

	public static void main(String[] args)
	{
		int kor = 90;
		int eng = 70;
		int math = 80;
		
		double average = (double) (kor+eng+math)/3;
		int total = kor+eng+math; 
		
		System.out.println(total);
		System.out.println(average);
	
		
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		System.out.println("num1 + num2 = " + num1 + num2);
		// 형변환이 문자열 + 문자열로 변환되어서 73이 출력된다.
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	}
	
}

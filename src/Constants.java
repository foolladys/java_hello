
public class Constants {

	public static void main(String[] args) {
		
		final int MAX_SIZE = 100;
		final char CONST_CHAR = 'A';
		final int CONST_ASSIGNED;
		final double pi = 3.14;
		
		int radius = 10;
		
		final int WIDTH = 120;
		final int HEIGHT = 180;
		
		// 리터럴 : 방 이름이 없는 상수(메모리엔 할당됨)
		// 정수로 direct로 표현된다.
		// 정수는 무조건 int로 , 실수는 무조건 double로 잡힘
		
		// 그래서 int의 범위를 벗어난 리터럴엔 L을 붙여줘야 한다
		// 예시 ) long a = 123123123123123L; 등
		// 실수는 정밀도를 위해서 앵간하면 double
		
		CONST_ASSIGNED = 12;
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		System.out.println("원의 넓이 : = " + radius*radius*Math.PI);
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		
		// final의 변수와는 다른 점. 
		// 상수는 딱 한번만 초기화가 가능하다.
		// (final 선언 후, 따로 값을 넣는게 가능) 값을 처음 넣는것을 초기화라고 함.
		// 상수의 이름은 어지간하면 전부 대문자로, 단어의 합성이라면 언더바를 사이에.
		// 스네이크 표기법
	}
	
}


// long->float long 말고 float으로, 원본 보존을 위해서
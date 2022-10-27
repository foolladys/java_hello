
public class IExample {

	public static void main(String[] args) {

		int math_Score =100;
		int kor_Score = 50;
		int eng_Score = 70;
		double avg_Score = (math_Score + kor_Score + eng_Score) / 3;
		
		char math_Grade = ' ';
		char kor_Grade =' ';
		char eng_Grade = ' ';
		char avg_Grade = ' ';
		
		// 수학 성적
		
		if(math_Score >= 90) {
			math_Grade = '수';
		}
		else if(math_Score >= 80) {
			math_Grade = '우';
		}
		else if(math_Score >= 70) {
			math_Grade = '미';
		}
		else if(math_Score >= 60) {
			math_Grade = '양';
		}
		else
			math_Grade = '가';
		
		// 국어 성적
		
		if(kor_Score >= 90) {
			kor_Grade = '수';
		}
		else if(kor_Score >= 80) {
			kor_Grade = '우';
		}
		else if(kor_Score >= 70) {
			kor_Grade = '미';
		}
		else if(kor_Score >= 60) {
			kor_Grade = '양';
		}
		else
			kor_Grade = '가';
		
		// 영어 성적
		
		if(eng_Score >= 90) {
			eng_Grade = '수';
		}
		else if(eng_Score >= 80) {
			eng_Grade = '우';
		}
		else if(eng_Score >= 70) {
			eng_Grade = '미';
		}
		else if(eng_Score >= 60) {
			eng_Grade = '양';
		}
		else
			eng_Grade = '가';
	
		// 전체 성적의 평균의 값
		
		if(avg_Score >= 90) {
			avg_Grade = '수';
		}
		else if(avg_Score >= 80) {
			avg_Grade = '우';
		}
		else if(avg_Score >= 70) {
			avg_Grade = '미';
		}
		else if(avg_Score >= 60) {
			avg_Grade = '양';
		}
		else
			avg_Grade = '가';
		
		
		
		System.out.println("수학 성적은 : " + math_Grade);
		System.out.println("국어 성적은 : " + kor_Grade);
		System.out.println("영어 성적은 : " + eng_Grade);
		System.out.println("전체 성적의 평균은 : " + avg_Grade);
	
	}

}
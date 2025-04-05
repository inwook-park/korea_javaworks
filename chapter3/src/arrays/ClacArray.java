package arrays;

public class ClacArray {

	public static void main(String[] args) {
		//정수형 배열을 생성하고 연산
		//합계와 총점
		int[] score = new int[] {75, 90, 80, 60};
		int sum = 0;
		Float avg;
		
		
		
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
			
		}
		
		avg = (float)sum / score.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		//printf 대응서식 %d 정수 , %f 실수, %s 문자
		System.out.printf("평균: %.1f\n", avg);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]+ " ");
		}
		System.out.println();
		
		//최대값, 최소값
		int max;
		max = score[0];
		
		for(int i = 0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최고 점수: "+ max);
		
		
		
		
		
		
	}

}

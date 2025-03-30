package loop;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 * for문(초기값; 종료값; 증감값) 
		 * 1~10
		*/
		
		for(int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		System.out.println(); //줄 바꿈
		
		// 1~10까지 합계와 평균
		int total = 0;
		//int avg = 0;
		 double avg;
		int n;
		for ( n = 1; n<=10; n++) {
			total += n;
			//avg = sum/10; 
			
		}
		avg = (double)total / (n-1);
		//평균은 
		System.out.println("합계는 " + total);
		System.out.println("평균 " + avg);
	}

}

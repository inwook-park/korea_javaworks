package loop;

public class WhileEx1 {

	public static void main(String[] args) {
		//반복문 - 초기값, 종료값, 증감값
		
		/*int n = 1;
		
		while(n > 10) { //종료값(조건식)
			System.out.println("HELLO " + n);
			n++;//증감값
		}*/
		
		
		
		
		
		
		
		// 1~10까지의 합계
		int n = 1;
		
		int sum = 0;
		double avg;
		while(n <= 10) {
			sum += n;
			System.out.println("n= " + n + ",sum=" + sum);
			n++;
		}
		//평균 = 합계/개수
		avg = (double)sum /(n-1);
		
			System.out.println("개수 " + n);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
		}
		
}



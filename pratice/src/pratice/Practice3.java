package pratice;

public class Practice3 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		int sum = 0;
		int i = 0;
		int avg = 0;
		
		for(i= 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = sum/5;
		}
		System.out.println(i);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
//for(i=0; i < number.length; i++) {
//	sum = sum + number[i];
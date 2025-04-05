package pratice;

public class Practice4 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		int sum = 0;
		int avg = 0;
		int i = 0;
		
		for(i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = sum/5;
		}
		
		System.out.println("총합; "+ sum);
		System.out.println("평균: "+ avg);
	}

}

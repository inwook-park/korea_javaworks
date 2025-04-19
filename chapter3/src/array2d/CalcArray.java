package array2d;

public class CalcArray {

	public static void main(String[] args) {
		// 2차원 정수형 배열 생성
		int[][] numbers =  {{1,2,3,4},{6,6,7}};
		int sum = 0;
		int count = 0;
		double avg;
		int x= numbers[1][1];
		System.out.println(x);
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
		}
		
		System.out.println();
		
		System.out.println("배열의 크기"+ numbers.length);
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				sum += numbers[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		
		
		
		
		System.out.println("합계"+sum); 
		System.out.println("개수" + count); 
		System.out.printf("평균: %.1f", avg);
		
	}

}

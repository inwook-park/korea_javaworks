package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사 
		
		//
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		

		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		//역순으로 복사
		System.out.println();
		
		for(int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[3-i];
		}
		

		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	}

}

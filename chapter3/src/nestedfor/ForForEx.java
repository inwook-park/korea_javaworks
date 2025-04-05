package nestedfor;

public class ForForEx {

	public static void main(String[] args) {
		// 중첩 for문
		//5행 5열
		
		
		for(int i = 0; i <=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("나"); 
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				int num = i * 5 + j;
				if(num> 23)
					break;
				
				System.out.print(num + " ");
			}
		System.out.println();
		}	
		System.out.println();
	}

}

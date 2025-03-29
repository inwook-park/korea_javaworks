package Choice;

public class IfElse2 {

	public static void main(String[] args) {
		// 두수의 크기 비교
		// 1. 조건 연산자 -(조건식) ? "참" : "거짓"
		int a = 10;
		int b = 20;
		int max;
		
		//연산 - 조건식의 결과는 true/false
		max = (a>b) ? a : b; 
		
		System.out.println("두 수중 큰수는 " + max + "입니다");
		
		// 2. 조건문 - if ~ else
		if(a>b){
			max = a;
		}
		else{
			max = b;
		}
		
		System.out.println("두 수중 큰수는 " + max + "입니다");

		
		
		
		
		//scanner sc = new Scanner(system.in);
		//System.out.println();
		//
		
		
		
		
	}

}

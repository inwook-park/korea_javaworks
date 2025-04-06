package methods;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스를 주요 메서드(함수) 사용
		//절대값
		int v1 = Math.abs(-10);
		 System.out.println(v1);
		//반올림
		long v2 = Math.round(5.58);
		System.out.println(v2);
		
		//내림
		double v3 = Math.floor(2.4);
		System.out.println(v3);
		
		double rand = Math.random();
		System.out.println(rand);
		
		//동전 던지기
		double result = (double) (Math.random() * 2);
		System.out.println(result);
		
		int coin = (int) (Math.random() * 2);
		System.out.println(coin);
		
		if(coin == 0) {
			System.out.println("앞");
		}else{
			System.out.println("뒤");
		}
		//주사위
		
		int dice;
		
		
		 dice = (int) (Math.random() * 6) + 1;
		System.out.println("한번: "+dice);
		
		//주사위 10번
		System.out.println("10번 던지기");
		for(int i = 0; i<=10; i++) {
			 dice = (int) (Math.random() * 6) + 1;
			System.out.println(dice);
		}
		
		
		//문자열을 랜덤하게 추출
		String[] word = {"나","너","우주","우리"};
		System.out.println(word[2]);
		System.out.println(word.length);
		
		
		
		int randx = (int)(Math.random()*4);
		System.out.println(word[randx]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

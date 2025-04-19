package arrays;

public class LottoTest {

	public static void main(String[] args) {
		//로또 프로그램
		int[] lotto = new int[6];
		//로또 한개 추첨
		//lotto[0] = (int)(Math.random() * 45) + 1;
		
		//System.out.println(lotto[0]);
		
		
		
		
		
		
		for(int i= 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j =0; j < i; j++) {
				if(lotto[i]==lotto[j])
					i--;
			}
			
			
		}
		for(int i= 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}

package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//난수 생성
		int n1 = (int)(Math.random()*2);
		System.out.println(n1);
		
		Random rnd =new Random();
		//rnd.setSeed(100);  시드값 설정 -한번만 난수 생성
		
		//System.out.println(rnd.nextInt());
		int n2 = rnd.nextInt(2);
		System.out.println(n2);
		
		//동전 던지기
		int coin = rnd.nextInt(2) + 1;
		if(coin == 1)
			System.out.println("앞");
		else
			System.out.println("뒤");
		
		
		
		
		//주사위 두 번 던지기
		//중복되면 "double thrown", 그 합이 7이면 "seven Thrown"
		
		//int dice1 = rnd.nextInt(6) + 1;
		//int dice2 = rnd.nextInt(6) + 1;
		
		int dice1, dice2, total;
		
		for(int i =1; i< 11; i++) {
			dice1 = rnd.nextInt(6) + 1;
			dice2 = rnd.nextInt(6) + 1;
			total = dice1 +dice2;
			System.out.println(total);
			if(total == 7)
				System.out.println("seven Thrown!");
			if(total == 10)
				System.out.println("ten Trown");
			if(dice1 == dice2)
				System.out.println("double Trown");
		
		}
		
		
		
		
		
		//System.out.println();
	}

}

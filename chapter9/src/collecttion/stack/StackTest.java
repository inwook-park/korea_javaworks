package collecttion.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		//스텍에서 동전 넣기
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);


		// 스텍에서 동전 꺼내기
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		
		System.out.println(coinBox.pop().getValue());
		System.out.println(coinBox.pop().getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue()+ "원");
		}
		
		
		
	}

}

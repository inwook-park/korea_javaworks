package lamda;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath math;
		
		math = (x) -> (x < 0) ? -x : x;
		System.out.println("절대값" + math.myAbs(-10));

	}

}

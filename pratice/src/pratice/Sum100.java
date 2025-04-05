package pratice;

public class Sum100 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(true) {
			sum += num;
			if(sum > 100)
			break;
			num++;
		}
		System.out.println("n = " + num);
		System.out.println("sum = " + sum);
	}

}

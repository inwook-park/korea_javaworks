package lamda;

public class StringConcatTest {

	public static void main(String[] args) {
	
		String str1 = "자바";
		String str2 = "프로그래밍";
		StringConcat concat;
	
	concat = (s, v) -> System.out.println(s + ", " + v);
	concat.makeString("자바", "프로그래밍");

	}

}

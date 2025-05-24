package string;

public class StringMethods2 {

	public static void main(String[] args) {
		// indexof와 lastindexof
		
		String url = "https://www.korea_it.kr/custom/broads";
		
		int n1 = url.indexOf("/");
		System.out.println(n1);
		
		
		int n2 = url.lastIndexOf("/");
		System.out.println(n2);
		
		String path = url.substring(n2);
		System.out.println(path);
		
//		
//		toUpperCase()- 대문자 변환
//		toLowerCase()- 소문자 변환
//		equals()- 문자열의 일치 여부(대소문자 구분)
//		equalsLgnoreCase(str)- 문자열 일치 여부(대소문자 구분 안함)
//		
		
		String str1 = "hello";
		String str2 = "hello";
		
		if(str1.equals(str2))
			System.out.println(str1.toUpperCase());
		else if(str1.equalsIgnoreCase(str2))
			System.out.println(str1.toLowerCase());
		else 
			System.out.println(str2);
		
		
		
		String carts = "potato strawbrerry garlic";
		
		String[] array= carts.split(" ");// 공백 문자로 변환
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		for(int i= 0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		
		
		String str = "1,2,3,4,5,6,7,8,9";
		String[] array2 = str.split(",");
		
		System.out.println(array[0]);
		
		//전체 출력
		for(int i = 0; i<array2.length; i++) {
		System.out.print(array2[i] + " ");
		if((i + 1) % 3 == 0)
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}

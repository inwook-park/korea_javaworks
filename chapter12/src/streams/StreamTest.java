package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
//		List <String> companyList = new ArrayList<>();
//	
//		companyList.add("LG");
//		companyList.add("SAMSONG");
//		companyList.add("HYUNDAI");
		
		//Arrays 클래스
		List<String> companyList = Arrays.asList("LG", "SAMSONG", "HYUNDAI");
		
		for(String company : companyList)
			System.out.println(company);
		System.out.println();
		//Stream 클래스 활용-람다식으로 구현
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
		System.out.println();
		
		
		//배열에서 스트림 클래스 사용
		String[] fruits = {"apple","banana","grape"};
		
		for(String fruit : fruits)
			System.out.println(fruit);
		System.out.println();
		Stream<String> stream2 = Arrays.stream(fruits);
		stream2.forEach(fruit -> System.out.println(fruit));
	}

}

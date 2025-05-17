package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		//컴퓨터 용어 사전 만들기
		Map<String, String> dic = new HashMap<>();
		
		dic.put("이진수", "컴퓨터...");
		dic.put("비트", "정보...");
		dic.put("버그", "프로그램...");
		dic.put("알고리즘", "어떤...");
		
	
		//입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("프로그램을 종류하려면 q 또는 Q를 입력하세요");
		System.out.println("===============================");

		while(true) {
			System.out.print("검색할 단어를 입력하세요:");
			String word = sc.nextLine();
			
			if(word.toLowerCase().equals("q")) {
				System.out.println("프로그램을 종류합니다.");
				break;
			}
			
			
			
			//정의괸 단어 가져오기
			String definition = dic.get(word);
			
			if(definition != null) {
				System.out.println(definition);
			}else {
				System.out.println(word + "는 없는 단어입니다.");
			}
		}
	
	
	
	}

}

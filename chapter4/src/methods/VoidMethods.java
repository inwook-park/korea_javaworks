package methods;

public class VoidMethods {

	
		// 인사하는 기능의 함수
		public static void sayhello() {
			System.out.println("안녕하세요"); 
		}
		
		
		
		public static void sayhello(String name) {
			System.out.println(name +"님 안녕하세요");
		}
		//main()함수
		public static void main(String[] args) {
		//변환된()이 없는 함수
			sayhello(); // 함수 호출
			sayhello("정후");
			sayhello("민정");
	}

}

package exceptions;

public class ExeceptionHanding1 {
	public static void printLength(String data) {
		int result = data.length();
				System.out.println("문자 수: "+ result);
	}
	
	
	public static void main(String[] args) {
		//예외 발생
		System.out.println("프로그램 시작\n");
		try {// 예외가 발생할 수 있는 곳을 try ~catch로 감싼다
		printLength("hello");
		printLength(null);
		}catch(NullPointerException e) {
			//NullPointerException 대신에 부모인Exception 사용 가능
		System.out.println(e.getMessage());
			
		}
		
		System.out.println("프로그램 종류");
	}

}

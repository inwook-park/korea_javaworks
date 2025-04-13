package statics;

public class HelloTest {

	public static void main(String[] args) {
		//인스턴스형
		Hello greeting = new Hello();
		greeting.sayhello();
		
		//greeting.sayGoodBye();
		//static형 메서드는 클래스 이름을 직접 접근하지 않는다
		Hello.sayGoodBye();
		
	}

}

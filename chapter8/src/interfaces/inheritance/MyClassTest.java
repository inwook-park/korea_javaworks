package interfaces.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		//MyClass객체 생성
		MyClass myClass = new MyClass();
		
		//부모 타입으로 형 변현환
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		//X, Y를 상속한 iClass 객체 생성
		MyInterface iClass = myClass;
		iClass.method();
		iClass.x();
		iClass.y();
	
	}

}




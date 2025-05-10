package interfaces.calculater;

public interface Calculater {
	//선언된 변수는 상수로 변환됨(final이 있음)
	int ERROR = -999999;
	
	
	
	
	
	//모든 메서드가 추상메서드이다.
	//정수형 계산기 구현
	//선언부만 있는 구현 블럭은 없음
	int add(int n1,int n2);
	int subtract(int n1,int n2);
	int times(int n1,int n2);
	int divide(int n1,int n2);
	
	
}

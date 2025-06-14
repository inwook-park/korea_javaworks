package interface_impl;

public class MyMathImpl implements MyMath {

	public MyMathImpl() {}

	@Override
	public int myAbs(int n) {
		if(n < 0) {
			return -n;
		}else {
			return n;
		}
	}
	
	
	

}

package interfaces.calculater;

public class MyCalculater implements Calculater{

	@Override
	public int add(int n1, int n2) {
		
		return n1 + n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		//if(n2 != 0)
		return n1 / n2;
		//else
		//	return Calculater.ERROR;
	}
	
	
	
	
	
	
}

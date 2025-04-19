package chap4;

import java.util.Scanner;

public class Myabs {

	public static int myAbs(int x) {
			if(x<0) {
		return - x;
			
		}else {
			return x;
		}
	}
	
	
	
	public static void main(String[] args) {
	
		 int value1 = myAbs(-4);
		 System.out.println("maAbs(-4) = "+value1);
		 int value2 = myAbs(4);
		 System.out.println("maAbs(4) ="+value1);
	}
	}	

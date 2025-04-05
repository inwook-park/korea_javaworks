package arrays;

public class ArrayChar {

	public static void main(String[] args) {
		//알파벳 저장 -26
		//char ch = 'A';
		//ch = (char) (ch +1);
		//ch++;
		//	System.out.println(ch); 
		char ch ='A';
		char[] alp = new char[26];
		
		//alp[0] = ch;
		//ch++;
		//alp[1] =ch;
		//ch++;
		//System.out.println(2);
		System.out.println("배열의 길이" + alp.length);
		
		for(int i = 0; i < alp.length; i++) {
			alp[i] = ch;
			ch++;
			System.out.println(alp[i] +"," + (int)alp[i]);
		}
		
		
	}

}

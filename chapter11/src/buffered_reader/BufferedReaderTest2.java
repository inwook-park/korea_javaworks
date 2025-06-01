package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {
			String str;
			String[] list = null;
			
		while((str = br.readLine()) != null) {
			list = str.split(" ");
		}
		System.out.println(list[0]);
		
		System.out.println(Arrays.toString(list));
		
		int rndIdx = (int)(Math.random()*list.length);
		System.out.println(list[rndIdx]);
		
		} catch (IOException e) {		
		}
	}

}

package buffered_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writeExample2 {

	public static void main(String[] args) {
		try (Writer writer = new FileWriter("word.txt")){
			//String words = "ant bear cow"
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}

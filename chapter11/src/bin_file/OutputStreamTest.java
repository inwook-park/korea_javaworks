package bin_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) {
	try {
		OutputStream os = new FileOutputStream("file2.bin");
		byte a = 10;
		byte b = 20;
		
		
			os.write(a);
			os.write(b);
			
			byte[] array = {65, 66, 67};
			os.write(array);
			
			os.flush();
			os.close();
			
	} catch (IOException e) {
		e.printStackTrace();
	} 
	}

}

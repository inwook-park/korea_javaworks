package bin_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("C:/file/file2.bin")) {
			
			byte[] data = new byte[256];
			
			while(true) {
				int num = is.read(data);
				if(num == 1) break;
				for(int i =0; i<num; i++) {
					System.out.print((char)data[i]);
				}				
			}
			//is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

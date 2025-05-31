package bin_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
//이미지 복사
		String originFile = "C:/javaworks/chapter11/pic1.jpg";
		String copyFile = "C:/javaworks/chapter11/pic1.jpg";
		long start, end;
		try(InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();
				while(true) {
					int num = is.read();
					if(num== -1) break;
					os.write(num);
				}
				end = System.currentTimeMillis();
				System.out.println("복사 시간: "+(end-start)+ "ms");
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}

package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) {
	
		String originFile = "C:/javaworks/chapter11/pic1.jpg";
		String copyFile = "C:/javaworks/chapter11/pic1.jpg";
		long start,end;
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
					BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			//starcd c:/
			start = System.currentTimeMillis();
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			
			end = System.currentTimeMillis();
			System.out.printf("복사 시간: %dms", (end - start));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package text_file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File dir  = new File("c:/file2");
		if(!dir.exists())
			dir.mkdir();
		//신규 파일 생성
		File file = new File("c:/file2/new_file.txt");
		file.createNewFile();
		
		//파일 정보 출력
		System.out.println(file.isFile()); //true
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
	}

}

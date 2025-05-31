package text_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try {
			//파일 열기
			Reader reader = new FileReader("C:/file/text.txt");
		//파일 읽기
			while(true) {
				int data = reader.read();
				//-1은 문자가 없다
				if(data == -1) break;
				System.out.println((char)data); //문자형 형 변환후 풀력
			}
		
			
			//파일 종류
			reader.close();
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

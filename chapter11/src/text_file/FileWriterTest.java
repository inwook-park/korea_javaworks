package text_file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {


		try {
			Writer writer =  new FileWriter("C:/file/text.txt");
		//한 개의 문자 쓰기
		writer.write('A');
		writer.write('b');
		
		//아스키 코드값
		writer.write(49);
		
		//배열
		char[] arr = {'C','D','E'};
		writer.write(arr);
		
		//줄바꿈 기호
		writer.write('\n');
		
		
		
		//문자열 쓰기
		writer.write("korea");
		writer.write("좋아요");
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

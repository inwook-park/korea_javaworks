package bin_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		//try ~ with ~resources(자원을 효율조)
		try(OutputStream os = new FileOutputStream("file2.bin")) {
			byte[] array = {48, 49, 50, 51, 52};
			
			os.write(array, 1, 3); //1~3 인덱스까지 쓰기
			
			os.flush();
			System.out.println("쓰기 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		}

	}

}

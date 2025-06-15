package socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {
		
		//Socket 객체 생성과 연결 요청
		try {
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[클라이언트] 연결 성공!");
			 //-----------------------------------------------//
			String sendMessage = "오늘도 즐거운 하루되세요";
			
			OutputStream os = socket.getOutputStream();
			byte[] bytes = sendMessage.getBytes("utf-8");
			os.write(bytes);
			os.flush();
			System.out.println("클라이언트 데이터 보냄: " + sendMessage);
			
			 //-----------------------------------------------//
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
package inetaddress;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

public class InetaddressTest {

	public static void main(String[] args) {
		// 내 컴퓨터 아이피 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());
			//InetAddress sever = InetAddress.getByName("www.naver.com");
			//System.out.println(sever);
			InetAddress[] servers = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : servers)
				System.out.println(remote);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

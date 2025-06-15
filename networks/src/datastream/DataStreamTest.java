package datastream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// 보조 스트림
		
		try (FileOutputStream fos = new FileOutputStream("object.dat");
			DataOutputStream dos = new DataOutputStream(fos)) {
				
			dos.write(1);
			dos.writeUTF("우영우");
			dos.writeDouble(95.1);
			
			dos.write(2);
			dos.writeUTF("우그래");
			dos.writeDouble(85.1);
			
			dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try(FileInputStream fis = new FileInputStream("object.dat");
			DataInputStream dis = new DataInputStream(fis)){
			
			for(int i =0; i<2; i++) {
				int no = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(no +", "+name+" : "+score);
			}
			
	} catch (IOException e) {
		e.printStackTrace();
	}
	

		
		
		
	}
}

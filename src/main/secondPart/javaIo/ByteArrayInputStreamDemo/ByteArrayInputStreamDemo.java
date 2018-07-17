package main.secondPart.javaIo.ByteArrayInputStreamDemo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class ByteArrayInputStreamDemo {
	@Test
	public void test1() throws IOException {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] buff = str.getBytes("utf-8");
		ByteArrayInputStream bis = new ByteArrayInputStream(buff);
		int len = 0;
		while((len = bis.read())>-1) {
			
			System.out.print((char)len);
		}
//		byte[] b = new byte[1024];
//		
//		while(bis.read(b)>-1) {
//			System.out.print(new String(b));
//		}
	}

}

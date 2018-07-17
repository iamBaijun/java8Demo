package main.secondPart.javaIo.inputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

public class InputStreamDemo {
	public final String path = "F:"+File.separator+"demo"+File.separator+"path";
	@Test
	public void test1() throws IOException {
		InputStream is = new FileInputStream(path+File.separator+"file.bat");
		int len = 0;
		while((len = is.read())>-1) {
			System.out.print((char)len);
		}
		is.close();
	}
	@Test
	public void test2() throws IOException {
		FileInputStream fis = new FileInputStream(path+File.separator+"file.bat");
		byte[] buff = new byte[1024];
		while(fis.read(buff)>-1) {
			//System.out.println(Arrays.toString(buff));
			String str = new String(buff,"utf-8");
			System.out.println(str);
		}
		fis.close();
	}

}

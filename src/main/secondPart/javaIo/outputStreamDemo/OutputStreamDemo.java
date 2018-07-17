package main.secondPart.javaIo.outputStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class OutputStreamDemo {
	public final String path = "F:"+File.separator+"demo"+File.separator+"path"+File.separator+"file.bat";
	@Test
	public void test1() throws IOException {
		OutputStream os = new FileOutputStream(path,true);
		String str = "ÄãºÃ";
		byte[] buff = str.getBytes("utf-8");
		os.write(buff);
		os.flush();
		os.close();
	}
	@Test
	public void test2() throws IOException {
		FileOutputStream fos = new FileOutputStream(path,true);
		int len = 65;
		while(len<100) {
			fos.write(len);
			len++;
		}
		fos.flush();
		fos.close();
	}

}

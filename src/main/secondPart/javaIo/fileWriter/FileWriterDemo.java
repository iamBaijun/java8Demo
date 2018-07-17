package main.secondPart.javaIo.fileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;

public class FileWriterDemo {
	@Test
	public void test1() throws IOException {
		FileWriter fw = new FileWriter(FileUtil.PATH);
		String str = "";
		int count = 0;
		while(count<10) {
			str=count+"ºº×Ö";
			fw.write(str+"\n");
			count++;
		}
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(FileUtil.PATH);
		int len = 0;
		char[] cbuf = new char[1024];
		while((len = fr.read(cbuf))>-1) {
			System.out.println(new String(cbuf));
		}
		fr.close();
	}

}

package main.secondPart.javaIo.charArrayReaderANDWriter;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;

public class CharArrayDemo {
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: CharArrayReader  
	 * @date:2018年7月17日上午10:33:49
	 * @throws IOException      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() throws IOException {
		String str = "春江潮水连海平";
		char[] cuff = new char[str.length()];
		str.getChars(0, str.length(), cuff,0);
		int len = 0;
		CharArrayReader cr = new CharArrayReader(cuff);
		while((len = cr.read())>-1) {
			System.out.print((char)len);
		}
	}
	@Test
	public void test2() throws IOException {
		String str = "海上明月共潮生";
		char[] cuff = new char[str.length()];
		str.getChars(0, str.length(), cuff,0);
		CharArrayWriter cw = new CharArrayWriter();
		cw.write(cuff);
		try(FileWriter fw = new FileWriter(FileUtil.PATH)){
			fw.append(new Date().toString());
			cw.writeTo(fw);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

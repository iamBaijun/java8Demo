package main.secondPart.javaIo.BufferedDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;
//¸´ÖÆÎÄ¼þ
public class BufferedDemo {
	@Test
	public void test1() throws IOException {
		File file = new File(FileUtil.PATH);
		File fileParent = new File(file.getParentFile().toString(),"fileCopy.bat");
		fileParent.createNewFile();
		String path = fileParent.getPath();
		
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(FileUtil.PATH)
				);
		byte[] buff = new byte[1024];
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(path)
				);
		int len  = 0;
		while((len = bis.read(buff))>-1) {
			bos.write(buff, 0, len);
		}
		bos.flush();
		bos.close();
		bis.close();
		
		
	}

}

package main.secondPart.javaIo.ByteArrayOutputStreamDemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;

/**   
 * @ClassName:  ByteArrayOutputSreamDemo   
 * @Description:�ֽ����������ʵ��  
 * @author: baijun 
 * @date:   2018��7��16�� ����4:25:04   
 *     
 * @Copyright: 2018  
 */  
public class ByteArrayOutputSreamDemo {
	@Test
	public void test1() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String str = "����������һЩ����";
		byte[] buff = str.getBytes("utf-8");
		bos.write(buff);
		System.out.println(new String(bos.toByteArray(),"utf-8"));
		//д���ļ���
		OutputStream os = new FileOutputStream(FileUtil.PATH,true);
		os.write(new Date().toString().getBytes("utf-8"));
		bos.writeTo(os);
		bos.reset();
		
//		os.flush();
//		bos.flush();
//		
//		os.close();
	}

}

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
 * @Description:字节数组输出的实现  
 * @author: baijun 
 * @date:   2018年7月16日 下午4:25:04   
 *     
 * @Copyright: 2018  
 */  
public class ByteArrayOutputSreamDemo {
	@Test
	public void test1() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String str = "在这里输入一些文字";
		byte[] buff = str.getBytes("utf-8");
		bos.write(buff);
		System.out.println(new String(bos.toByteArray(),"utf-8"));
		//写入文件中
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

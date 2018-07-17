package main.secondPart.javaIo.PashBackInputStreamDemo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

/**   
 * @ClassName:  PushBackInputStreamDemo   
 * @Description:推流  
 * @author: baijun 
 * @date:   2018年7月16日 下午5:09:14   
 *     
 * @Copyright: 2018  
 */  
public class PushBackInputStreamDemo {
	@Test
	public void test1() throws IOException {
		String str = "if(a==4) a=5";
		byte[] buff = str.getBytes("utf-8");
		ByteArrayInputStream bis = new ByteArrayInputStream(buff);
		PushbackInputStream pis = new PushbackInputStream(bis);
		int len = 0;
		while((len = pis.read())!=-1) {
			switch(len) {
			case '=':
				if((len = pis.read())=='=') {
					System.out.print(".eq.");
				}else {
					System.out.print("<-");
					pis.unread(len);
				}
				break;
				default:
					System.out.print((char)len);
			}
		}
	}

}

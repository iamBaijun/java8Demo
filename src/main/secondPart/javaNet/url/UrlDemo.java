package main.secondPart.javaNet.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class UrlDemo {
	@Test
	public void test1() {
		try {
			URL url = new URL("http://www.baidu.com");
			System.out.println(url);
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			//System.out.println(url.getPath());
			System.out.println(url.getHost());
			System.out.println(url.getFile());
			System.out.println(url.toExternalForm());
			
			try {
				URLConnection uc = url.openConnection();
				System.out.println(uc);
				InputStream is = uc.getInputStream();
				int len = 0;
				byte[] buff = new byte[1024];
				while((len = is.read(buff))>-1) {
					System.out.print(new String(buff,"utf-8"));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

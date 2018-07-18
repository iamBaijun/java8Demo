package main.secondPart.javaNet.urlConnection;

import java.io.IOException;
import java.net.FileNameMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.sun.net.ssl.HttpsURLConnection;

import sun.net.www.protocol.http.HttpURLConnection;

public class URLConnectionDemo {
	/**   
	 * @Title: URLConnection  
	 * @author:baijun
	 * @Description: 访问远程资源属性的通用类   
	 * @date:2018年7月18日下午3:04:17      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		URL url;
		try {
			url = new URL("http://www.baidu.com");
			URLConnection uc = url.openConnection();
			System.out.println(uc);
			System.out.println(uc.getContentLength());
			System.out.println(uc.getContentEncoding());
			System.out.println(uc.getLastModified());
			System.out.println(uc.getContentType());
			System.out.println(uc.getDate());
			Map<String, List<String>> map= uc.getHeaderFields();
			map.forEach((k,v)->{
				System.out.println("-----  "+k+"  ------");
				v.forEach((str)->System.out.println(str));
			});
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**   
	 * @Title: HttpURLConnection 是URLConnection  的子类   
	 * @author:baijun
	 * @Description:  
	 * @date:2018年7月18日下午3:05:23      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		try {
			HttpURLConnection huc = (HttpURLConnection) new URL("http://www.baidu.com").openConnection();
			System.out.println(huc);
			System.out.println(huc.getContent());
			System.out.println(huc.getConnectTimeout());
			System.out.println(huc.getContentEncoding());
			System.out.println(huc.getContentLength());
			System.out.println(huc.getContentType());
			System.out.println(huc.getRequestMethod());
			System.out.println(huc.getResponseMessage());
			System.out.println("==================================");
			Map<String,List<String>> map = huc.getHeaderFields();
			map.forEach((k,v)->{
				System.out.println("------"+k+"-------");
				v.forEach((str)->System.out.println(str));
			});
					
		
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}

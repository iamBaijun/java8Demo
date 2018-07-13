package main.secondPart.javaUtil;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;

public class PropertiesDemo {
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: getProperty("ky","123") ����Ĭ��ֵ  
	 * @date:2018��7��13������3:32:52      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		Properties properties = new Properties();
		
		properties.put("key", "value");
		System.out.println(properties);
		System.out.println(properties.getProperty("ky","123"));
		
		//-----����Ĭ��ֵ-
		Properties p = new Properties(properties);
		p.put("name", "zhangsan");
		p.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println(p.getProperty("key"));
	}
	/**
	 * @throws IOException    
	 * @Title: test2   
	 * @author:baijun
	 * @Description: ��������ĵ绰��   
	 * @date:2018��7��13������4:30:21      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() throws IOException {
		
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		Properties p = new Properties();
		String name,number;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.dat");
			p.load(fis);
			p.forEach((k,v)->System.out.println(k+":"+v));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			if(fis == null) {
				p.load(fis);
				fis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("����");
		name = bis.readLine();
		System.out.println("����");
		number = bis.readLine();
		p.put(name, number);
		FileOutputStream fos = new FileOutputStream("file.dat",true);
		p.store(fos, "phoneNumber");
		
	}

}

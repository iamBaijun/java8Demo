package main.secondPart.stringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**   
 * @ClassName:  Demo1   
 * @Description:String 示例  
 * @author: baijun 
 * @date:   2018年7月10日 下午3:59:28   
 *     
 * @Copyright: 2018  
 */  
public class StringDemo {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: getChars getBytes  
	 * @date:2018年7月10日下午3:59:23      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		//-------------getChars
		String demo = "hello string this is demo";
		int start = 0;
		int end = 10;
		char[] chff =new char[end-start];
		 demo.getChars(start, end, chff, 0);
		 System.out.println(chff);
		 //----------------getBytes
		 byte[] buff = demo.getBytes();
		 for(byte b : buff) {
			 String name= b!=32?String.valueOf((char)b):"空格";
			 System.out.println(name+ "对应的编码:"+b);
		 }
		
		
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: equals 大小写敏感   equalsIgnoreCase 大小写不敏感
	 * @date:2018年7月10日下午4:43:12      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		String str = "zhangsan";
		System.out.println(str.equalsIgnoreCase("ZHANGSAN"));
	}
	/**   
	 * @Title: test3   
	 * @author:baijun
	 * @Description: equals and ==  
	 * @date:2018年7月10日下午4:56:06      
	 * void      
	 * @throws   
	 */
	@Test
	public void test3() {
		String a ="123";
		String b = "123";
		String c = new String("123");
		System.out.println(a==b);
		System.out.println(a==c);
	}
	/**   
	 * @Title: test4   
	 * @author:baijun
	 * @Description: compareTo 字符串按照字典顺序排序  
	 * 大小写敏感 compareToIgnoreCase(str) 大小写不敏感
	 * @date:2018年7月10日下午5:00:11      
	 * void      
	 * @throws   
	 */
	@Test
	public void test4() {
		String[] strs = {"one","show","second","bai"};
		List<String> list = Arrays.asList(strs);
		System.out.println(list);
		for(int i=0;i<strs.length;i++) {
			for(int j=i+1;j<strs.length;j++) {
				if(strs[i].compareTo(strs[j])>0) {
					String a = strs[i];
					strs[i] = strs[j];
					strs[j] = a;
				}
			}
		}
		System.out.println(list);
	}

}

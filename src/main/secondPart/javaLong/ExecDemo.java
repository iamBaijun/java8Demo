package main.secondPart.javaLong;

import org.junit.Test;

/**   
 * @ClassName:  ExecDemo   
 * @Description:�򿪳��� 
 * @author: baijun 
 * @date:   2018��7��10�� ����5:46:25   
 *     
 * @Copyright: 2018  
 */  
public class ExecDemo {
	
	@Test
	public void test1() {
		Runtime runtime = Runtime.getRuntime();
		Process p = null;
		try {
			p  = runtime.exec("notepad");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}

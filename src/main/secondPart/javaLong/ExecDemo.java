package main.secondPart.javaLong;

import org.junit.Test;

/**   
 * @ClassName:  ExecDemo   
 * @Description:打开程序 
 * @author: baijun 
 * @date:   2018年7月10日 下午5:46:25   
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

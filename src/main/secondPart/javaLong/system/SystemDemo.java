package main.secondPart.javaLong.system;

import java.util.Map;

import org.junit.Test;

import main.secondPart.entity.User;

/**   
 * @ClassName:  SystemDemo   
 * @Description:system系统测试  
 * @author: baijun 
 * @date:   2018年7月12日 上午11:35:35   
 *     
 * @Copyright: 2018  
 */  
public class SystemDemo {

	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: System.getenv() 返回当前环境变量的map
	 * @date:2018年7月12日上午11:46:39      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		Map<String,String> map = System.getenv();
		map.forEach((key,val)->{
			System.out.println(key+" : "+val);
		});
		
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: nanoTime 返回系统中最精准的计时器
	 * @date:2018年7月12日上午11:48:10      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		long time = System.nanoTime();
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		
	}

	
}

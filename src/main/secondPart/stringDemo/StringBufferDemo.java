package main.secondPart.stringDemo;

import org.junit.Test;

/**   
 * @ClassName:  StringBufferDemo   
 * @Description:StringBuffer 测试示例 
 * @author: baijun 
 * @date:   2018年7月10日 下午5:23:40   
 *     
 * @Copyright: 2018  
 */  
public class StringBufferDemo {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description:StringBuffer capacity 
	 * @date:2018年7月10日下午5:23:58      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		StringBuffer name = new StringBuffer();
		System.out.println(name.capacity());
		StringBuffer str = new StringBuffer("张三");
		System.out.println(str.capacity());
		
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: insert()  
	 * @date:2018年7月10日下午5:31:10      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		StringBuffer str = new StringBuffer("将要在这句话再插入一句话");
		System.out.println(str.insert(5, "sss"));
	}

}

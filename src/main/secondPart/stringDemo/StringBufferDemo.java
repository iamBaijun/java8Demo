package main.secondPart.stringDemo;

import org.junit.Test;

/**   
 * @ClassName:  StringBufferDemo   
 * @Description:StringBuffer ����ʾ�� 
 * @author: baijun 
 * @date:   2018��7��10�� ����5:23:40   
 *     
 * @Copyright: 2018  
 */  
public class StringBufferDemo {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description:StringBuffer capacity 
	 * @date:2018��7��10������5:23:58      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		StringBuffer name = new StringBuffer();
		System.out.println(name.capacity());
		StringBuffer str = new StringBuffer("����");
		System.out.println(str.capacity());
		
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: insert()  
	 * @date:2018��7��10������5:31:10      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		StringBuffer str = new StringBuffer("��Ҫ����仰�ٲ���һ�仰");
		System.out.println(str.insert(5, "sss"));
	}

}

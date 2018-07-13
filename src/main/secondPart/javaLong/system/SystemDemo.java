package main.secondPart.javaLong.system;

import java.util.Map;

import org.junit.Test;

import main.secondPart.entity.User;

/**   
 * @ClassName:  SystemDemo   
 * @Description:systemϵͳ����  
 * @author: baijun 
 * @date:   2018��7��12�� ����11:35:35   
 *     
 * @Copyright: 2018  
 */  
public class SystemDemo {

	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: System.getenv() ���ص�ǰ����������map
	 * @date:2018��7��12������11:46:39      
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
	 * @Description: nanoTime ����ϵͳ���׼�ļ�ʱ��
	 * @date:2018��7��12������11:48:10      
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

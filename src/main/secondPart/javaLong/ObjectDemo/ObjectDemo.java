package main.secondPart.javaLong.ObjectDemo;

import org.junit.Test;

import main.secondPart.entity.User;

public class ObjectDemo {
	/**   
	 * @Title: test3   
	 * @author:baijun
	 * @Description: clone  
	 * @date:2018年7月12日下午1:29:09
	 * @throws CloneNotSupportedException      
	 * void      
	 * @throws   
	 */
	@Test
	public void test3() throws CloneNotSupportedException {
		User user = new User();
		user.setId("1");user.setName("zhangsan");
		User user1 = user.clobe();
		//user.setId("1");user.setName("zhangsan");
		System.out.println(user);
		System.out.println(user1);
	}

}

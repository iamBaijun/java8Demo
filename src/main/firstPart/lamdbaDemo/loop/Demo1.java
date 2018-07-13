package main.firstPart.lamdbaDemo.loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
public class Demo1 {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: list 测试
	 * @date:2018年7月12日上午11:40:19      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		List<List<Integer>> arrs = new ArrayList<List<Integer>>();
		for(int i=0;i<10;i++) {
			List<Integer> arrs1 = new ArrayList<Integer>();
			for(int j=0;j<10;j++) {
				arrs1.add(j);
			}
			arrs.add(arrs1);
		}
		arrs.forEach((n)->{
			n.forEach((m)->System.out.println(m));
		});
		
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: map 测试  
	 * @date:2018年7月12日上午11:40:42      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		Map<String,Object> map = new HashMap();
		for(int i=0;i<5;i++) {
			map.put("key-"+i, "val-"+i);
		}
		map.forEach((key,val)->{
			System.out.println(key+" : "+val);
		});
	}

}

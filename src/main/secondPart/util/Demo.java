package main.secondPart.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;

import org.junit.Test;

import main.secondPart.javaLong.comparabel.Emp;

public class Demo {
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: iterable iterator
	 * @date:2018年7月12日下午3:06:56      
	 * void      
	 * @throws   
	 */
	@Test
	public void test2() {
		List<Emp> list = new ArrayList<Emp>();
		for(int i=0;i<5;i++) {
			Emp emp = new Emp();
			emp.setId(String.valueOf(i));
			emp.setName("name"+i);
			
			list.add(emp);
		}
		Iterator<Emp> e = list.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		Spliterator<Emp> s = list.spliterator();
	}
	//-----------------------以下是集合相关的操作-----------------------------------------
	/**   
	 * @Title: test3   
	 * @author:baijun
	 * @Description: contains  
	 * @date:2018年7月12日下午3:45:17      
	 * void      
	 * @throws   
	 */
	@Test
	public void test3() {
		List<String> list = new ArrayList<String>();
		list.add("鱼");
		list.add("猪");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().contains("鱼")) {
				iterator.remove();
			}
		}
		list.forEach((n)->System.out.println(n));
	}
	/**   
	 * @Title: test4   
	 * @author:baijun
	 * @Description: list.toArray(new Integer[0]); 
	 * @date:2018年7月12日下午4:26:11      
	 * void      
	 * @throws   
	 */
	@Test
	public void test4() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		Object[] obj  =  list.toArray();
		System.out.println(obj);
		Integer[] intList = list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(intList));
	}
	/**   
	 * @Title: test5   
	 * @author:baijun
	 * @Description: forEachRemaining 
	 * @date:2018年7月12日下午4:26:42      
	 * void      
	 * @throws   
	 */
	@Test
	public void test5() {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("val"+i);
		}
		System.out.println("--------------------------------------");
		list.forEach((n)->System.out.print(n));
		System.out.println();
		System.out.println("--------------------------------------");
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining((n)->{
			System.out.print(n);
		});
	}
	/**   
	 * @Title: test6   
	 * @author:baijun
	 * @Description: sliterator1 
	 * @date:2018年7月12日下午4:47:42      
	 * void      
	 * @throws   
	 */
	@Test
	public void test6() {
		List<Double> list = new ArrayList<Double>();
		list.add(2.0);
		Spliterator<Double> s = list.spliterator();
		List<Double> st = new ArrayList<Double>();
		while(s.tryAdvance((n)->st.add(Math.pow(n, 2))))
		st.spliterator().forEachRemaining((n)->System.out.println(n));
	}
	/**   
	 * @Title: test7   
	 * @author:baijun
	 * @Description: map  
	 * @date:2018年7月12日下午5:15:55      
	 * void      
	 * @throws   
	 */
	@Test
	public void test7() {
		Map<String,Object> map = new HashMap<String,Object>();
		for(int i=0;i<5;i++) {
			map.put("key"+i, "value"+i);
		}
		Set<Entry<String, Object>> entry = map.entrySet();
		entry.forEach((n)->System.out.println(n.getKey()+" : "+n.getValue()));
		List<String> keys = new ArrayList<String>();
		entry.forEach((n)->keys.add(n.getKey()));
		System.out.println("--------------------------------");
		for(String key:keys) {
			System.out.println(map.get(key));
		}
	}


}

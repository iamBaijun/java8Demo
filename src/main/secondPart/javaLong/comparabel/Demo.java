package main.secondPart.javaLong.comparabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;

import org.junit.Test;


public class Demo {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: comparable排序  必须先要实现 conparable接口
	 * @date:2018年7月12日下午2:24:55      
	 * void      
	 * @throws   
	 */
	
	@Test
	public void test1() {
		List<Emp> list = new ArrayList<Emp>();
		for(int i=0;i<5;i++) {
			Emp emp = new Emp();
			emp.setId(String.valueOf(i));
			emp.setName("name"+i);
			
			list.add(emp);
		}
		
		Collections.sort(list);
		
		list.forEach((e)->{
		System.out.println(e);
		});
			
	}
	@Test
	public void test2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.sort((n,m)->{
			System.out.println(n);
			System.out.println(m);
			return m-n;
		});
		System.out.println(list);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -1;
			}
			
		});
	}
	
}

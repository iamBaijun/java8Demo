package main.firstPart.lamdbaDemo.loop;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class Demo1 {
	
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

}

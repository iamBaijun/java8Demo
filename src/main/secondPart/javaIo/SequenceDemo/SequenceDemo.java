package main.secondPart.javaIo.SequenceDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.junit.Test;

import main.secondPart.javaIo.FileUtil;

/**   
 * @ClassName:  SequenceDemo   
 * @Description:序列流   
 * @author: baijun 
 * @date:   2018年7月16日 下午5:46:56   
 *     
 * @Copyright: 2018  
 */  
public class SequenceDemo {
	@Test
	public void test1() throws IOException {
		FileInputStream f1 = new FileInputStream(FileUtil.PATH1);
		FileInputStream f2 = new FileInputStream(FileUtil.PATH2);
		FileInputStream f3 = new FileInputStream(FileUtil.PATH3);
		List<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		Enumeration<FileInputStream> enumeration = Collections.enumeration(list);
		
		SequenceInputStream sis = new SequenceInputStream(enumeration);
		
		byte[] buff = new byte[1024];
		int len = 0;
		while((len = sis.read(buff))>-1) {
			System.out.println(new String(buff));
		}
		
		
	}

}

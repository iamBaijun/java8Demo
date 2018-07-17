package main.secondPart.javaIo.FileDemo;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FileDemo {
	@Test
	public void test1() {
		File file =new File("c:");
		String[] strs = file.list();
		List<String> list = Arrays.asList(strs);
		list.forEach((n)->System.out.println(n));
	}

}

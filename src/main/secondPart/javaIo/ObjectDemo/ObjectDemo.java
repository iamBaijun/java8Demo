package main.secondPart.javaIo.ObjectDemo;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import main.secondPart.entity.User;

public class ObjectDemo {
	@Test
	public  void test1() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("seria")
				)){
			User user = new User("1","zhangsan");
			oos.writeObject(user);
			oos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2() throws ClassNotFoundException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("seria"))){
			User user = (User) ois.readObject();
			System.out.println(user.getId());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

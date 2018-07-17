package main.secondPart.javaUtil;

import java.util.Optional;

import org.junit.Test;

import main.secondPart.entity.User;

public class OptionalDemo {
	@Test
	public void test1() {
		
		User u =new User();
		Optional<User> o = Optional.of(u);
		
		System.out.println(o.isPresent());
		u.setId("1");u.setName("zhangsan");
		System.out.println(o.isPresent());
		System.out.println(o.get().getId());
		User user = o.orElse(u);
		System.out.println(user);
		
		
	}

}

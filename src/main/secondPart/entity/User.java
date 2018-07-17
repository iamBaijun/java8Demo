package main.secondPart.entity;

import java.io.Serializable;

/**   
 * @ClassName:  User   
 * @Description:clone() 方法，必须先实现Cloneable 接口   
 * @author: baijun 
 * @date:   2018年7月12日 下午1:25:57   
 *     
 * @Copyright: 2018  
 */  
public class User implements Cloneable,Serializable{
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	
	public User clobe() throws CloneNotSupportedException {
		return (User)super.clone();
	}

}

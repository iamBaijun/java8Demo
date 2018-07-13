package main.secondPart.entity;

/**   
 * @ClassName:  User   
 * @Description:clone() ������������ʵ��Cloneable �ӿ�   
 * @author: baijun 
 * @date:   2018��7��12�� ����1:25:57   
 *     
 * @Copyright: 2018  
 */  
public class User implements Cloneable{
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
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public User clobe() throws CloneNotSupportedException {
		return (User)super.clone();
	}

}

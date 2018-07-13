package main.secondPart.javaLong.comparabel;


public class Emp implements Comparable<Emp>{
	private String id;
	private String name;
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
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
	public int compareTo(Emp emp) {
		
		return Integer.parseInt(emp.getId())-Integer.parseInt(id);
	}


}

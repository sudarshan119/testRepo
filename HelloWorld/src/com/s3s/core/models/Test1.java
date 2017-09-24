package com.s3s.core.models;

public class Test1 {
	private String name;
	private int id;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Test1 [name=" + name + ", id=" + id + "]";
	}



	public static void main(String[] args) {
		Test1 t=new Test1();
		Test1 t2=new Test1();
		t.setId(10);
		t.setName("Henry");
		System.out.println(t);
	}

}

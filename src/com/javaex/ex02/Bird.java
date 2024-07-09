package com.javaex.ex02;

public abstract class Bird {
    protected String name;
    
    
    public Bird() {
		super();
	}

	public Bird(String name) {
		super();
		this.name = name;
	}

	public abstract void sing();
    
    public abstract void fly();
    
    public abstract void showName();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
   

}

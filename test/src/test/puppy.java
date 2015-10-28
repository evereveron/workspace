package test;

import java.io.Serializable;

public class puppy implements Serializable{
	String name;
	String breed;
	
	public puppy(String name, String breed){
		this.name = name;
		this.breed= breed;
	}
}

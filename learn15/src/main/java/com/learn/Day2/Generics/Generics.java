package com.learn.Day2.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	Object object;
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}


	public static void main(String args[]) {
		List<String> lists = new ArrayList<String>();
		
		lists.add("Names");
		//lists.add(new Integer(10));//compilation error
		
		Generics generics = new Generics();
		generics.setObject(10);
		
		System.out.println((String)generics.getObject());
		
	}

}

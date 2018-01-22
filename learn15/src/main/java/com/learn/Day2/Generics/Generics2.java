package com.learn.Day2.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics2<T> {
	
	T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	public static void main(String args[]) throws InstantiationException, IllegalAccessException {
		List<String> lists = new ArrayList<String>();
		
		lists.add("Names");
		//lists.add(new Integer(10));//compilation error
		
		Generics2 generics = new Generics2();
		generics.setT("Names");
		System.out.println((String)generics.getT());
		
		System.out.println(generics.getT().getClass());
		generics.setT(10);
		
		System.out.println((Integer)generics.getT());
		System.out.println(generics.getT().getClass());
		
		
	}

}

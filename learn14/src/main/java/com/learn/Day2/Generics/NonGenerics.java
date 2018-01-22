package com.learn.Day2.Generics;

import java.util.ArrayList;
import java.util.List;

public class NonGenerics {
	

	
	public static void main(String args[]) throws Exception{
		
		List lists = new ArrayList();
		lists.add("Names");
		lists.add(new Integer(10));
		
		for(int i=0;i<lists.size();i++) {
			Object object = lists.get(i);
			System.out.println((String)object);
		}
		
		
	}

}

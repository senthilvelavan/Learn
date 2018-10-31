package main.java.com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ChefFriends {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();

		List<String> arrayOfStrings = new ArrayList<String>();
		int count = s.nextInt();

		for(int i=0;i<count-1;i++) {
		String name = s.next();
//		if (name.contains("ch") || name.contains("he") || name.contains("ef")) {
			arrayOfStrings.add(name);
//		}
		}
		
		System.out.println("number of friends is "+arrayOfStrings.size());
	}

}

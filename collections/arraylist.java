package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add("Technogeek");
		al.add("Nov-23");
		al.add(90);
		
		System.out.println(al);
		
		Iterator it= al.iterator(); 
		//hasNext() – checks if there is another item
		//next() – gets the next item
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

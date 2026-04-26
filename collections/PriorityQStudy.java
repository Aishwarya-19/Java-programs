package com.java.collections;

import java.util.PriorityQueue;

public class PriorityQStudy {
public static void main(String[] args) {
		
		PriorityQueue pq= new PriorityQueue();
		
		pq.add("abc");
		pq.add("pqr");
		pq.add("lmn");
		pq.add("xyz");
		pq.add("aaa");
		System.out.println("Orginal: " + pq);
		System.out.println(pq.poll());
		System.out.println("After poll:This method retrieves and removes the head " + pq); 
		System.out.println(pq.peek()); 
		System.out.println("After peek:This method retrieves, but does not remove " + pq);
}
}

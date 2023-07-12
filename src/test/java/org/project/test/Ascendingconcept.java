package org.project.test;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ascendingconcept {
	public static void main(String[] args) {
		
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(46);
		l.add(30);
		System.out.println(l);
		
	Collections.sort(l);
	System.out.println(l);
	System.out.println(l.get(0));
	System.out.println(l.get(l.size()-1));
	System.out.println(Collections.max(l));
	System.out.println(Collections.min(l));
	System.out.println(Collections.max(l)+" "+Collections.min(l));
	
	}
	

}

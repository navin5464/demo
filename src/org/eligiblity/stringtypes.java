package org.eligiblity;

public class stringtypes {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder( "eligiblity");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
		s.append(" so u are allowed");
		System.out.println(s);
		
		
		
}
}

package org.empdetails;

public class samplejava {
	
	public samplejava() {
		this("navin");
		System.out.println("defalut constructor");
	}
	
		public samplejava(int i) {
			System.out.println("int const");
		}
		public samplejava(String name) {
			this(10);
			System.out.println("String const");
			
		}
		public static void main(String[] args) {
			samplejava s = new samplejava();
			
			
			
		}
	}




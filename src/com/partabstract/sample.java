package com.partabstract;

public class sample extends salarydetails{

	@Override
	public void sidesalary() {
		System.out.println("10k");
		
	}

	@Override
	public void monthlysalary() {
		System.out.println("60k");
	
	}
	  
	public static void main(String[] args) {
		sample s = new sample ();
		s.sidesalary();
		s.monthlysalary();
		s.directsalary();
		
				
	}

}

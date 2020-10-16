package com.methodoverloading;

public class PersonDetails {
	
       public void personName(int id) {
    	   System.out.println("user entered id : "+id);
		

	}
       public void personName(long phneno) {
    	   System.out.println("user entered phneno :"+phneno);
	

	}
       public void personName(int blockno,String name) {
    	   System.out.println("user entered blockno : "+blockno);
    	   System.out.println("user entered name : "+name);
    	   
		}
       public static void main(String[] args) {
    	   PersonDetails pd = new PersonDetails();
    	   pd.personName(789);
    	   pd.personName(456123789l);
    	   pd.personName(456, "naveen");
    	   
       }

}

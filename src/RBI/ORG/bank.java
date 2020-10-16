package RBI.ORG;

public class bank extends Reservebank{
	
	public void indianbank() {
		System.out.println("indianbank");

	}
	
	public void fedralbank() {
		System.out.println("fedralbank");

	}
	
	public static void main(String[] args) {
		bank b = new bank();
		
		b.indianbank();
		b.fedralbank();
		
	}

}

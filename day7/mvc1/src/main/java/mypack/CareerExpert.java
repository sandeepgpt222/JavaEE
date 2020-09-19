package mypack;

public class CareerExpert {
	
	public String getAdvice(String qual) {
		if(qual.trim().equalsIgnoreCase("be")) {
			return "PG diploma or ME courses";
		}
		else if(qual.equalsIgnoreCase("b.com")) {
			return "CA, CS, M.com specialization courses";
		}
		
		else {
			return "Sorry! Advice for your Qualification not present in out Database";
		}
		
		
	}
}

package mypack;

public class LoginBean {
	String uid = "scott";
	String password = "lang";
	
	public Boolean validate(String uid, String password) {
		
		if(this.uid.equalsIgnoreCase(uid) && this.password.equals(password)) {
			return true;
		}
		else{
			return false;
		}
	}
	

}

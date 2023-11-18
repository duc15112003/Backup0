package Bai2;

public class User {
	
	String name;
	String pass;
	boolean remember;
	
	public User(String name,String pass,boolean remember) {
		this.name = name;
		this.pass = pass;
		this.remember = remember;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isRemember() {
		return remember;
	}
	public void setRemember(boolean remember) {
		this.remember = remember;
	}
	
	

}

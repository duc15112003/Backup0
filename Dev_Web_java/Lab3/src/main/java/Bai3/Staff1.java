package Bai3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Staff1 {
	private String fullname;
	private String photo;
	private Date birthday;
	private boolean gender;
	private String country;
	private boolean married;
	private String hobbies;
	private String notes;
	public Staff1() {
		// TODO Auto-generated constructor stub
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String isHobby(String[] hb) {
		
		 String key = "";
		 Map<String, String> hm 
	        = new HashMap<String, String>();
		    hm.put("D", "playing"); ; 
		 	hm.put("R", "readding"); 
		    hm.put("T", "go to sleep"); 
			for(int i = 0;i<hb.length;i++) {
				for (Map.Entry<String, String> me : hm.entrySet()) {
					if(hb[i].equals(me.getKey())) {
		            // Printing keys
						key +=me.getValue()+", ";
		            System.out.println(me.getValue()); 
		        } 
				
			}
		
	}
			return key;
	
}
}
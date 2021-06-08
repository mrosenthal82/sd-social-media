package model;

public class User {
	
	private static long lastUserId = 1L; // initial customer ID

	private long userId;
    private String firstName;
	private String lastName;
	private String college;
	private String highSchool;
	private String hometown;
	private long birthday;
	private String email;
	private long phone;
	
	public User() {
		this.userId = User.lastUserId++;
	}
	
	public User(long userId, String firstName, String lastName, String college, String highSchool,
			String hometown, long birthday, String email, long phone) {
		
		this.userId = userId;
	    this.firstName = firstName;
		this.lastName = lastName;
		this.college = college;
		this.highSchool = highSchool;
		this.hometown = hometown;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getHighSchool() {
		return highSchool;
	}
	
	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}
	
	public String getHometown() {
		return hometown;
	}
	
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public long getBirthday() {
		return birthday;
	}
	
	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
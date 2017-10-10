package registrationSystem;

import java.util.Date;

public class student {

	public String name;
	public String age;
	public Date DOB;
	public int ID;
	public String username;
	
	public student(String sName, String sAge, Date sDOB, int sID, String sUsername){
		this.name = sName;
		this.age = sAge;
		this.DOB = sDOB;
		this.ID = sID;
		this.username = sUsername;
	}


	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public Date getDOB(){
		return DOB;
	}
	
	public void setDOB(Date DOB){
		this.DOB = DOB;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public static String Concatenator(String username, String age)
	{
		String user = username.concat(age);
		return user;
	}
	}
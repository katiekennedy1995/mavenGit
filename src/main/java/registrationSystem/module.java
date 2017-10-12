package registrationSystem;

import java.util.ArrayList;

public class module {
	private String name;
	private int ID;
	private ArrayList<student> studentList = new ArrayList<student>();

	public module(String moduleName, int moduleID){
		name = moduleName;
		ID = moduleID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID =ID;
	}
	
	public ArrayList<student> getStudents(){
		return studentList;
	}

	public void student(student addDetails){
		studentList.add(addDetails);
	}
	
}

package registrationSystem;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

public class courseProgramme {
	
	private String name;
	private ArrayList<module> moduleList = new ArrayList<module>();
	private DateTime startDate;
	private DateTime endDate;

	
	public courseProgramme(String cName, DateTime startDate, DateTime endDate){
		this.name =cName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public ArrayList<module> getModuleList() {
		return moduleList;
	}
	public void setModuleList(ArrayList<module> moduleList) {
		this.moduleList = moduleList;
	}

}

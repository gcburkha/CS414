import java.util.*;

public class Company {
	
	private String name;
	private ArrayList<Worker> workers;
	private ArrayList<Project> projects;
	
	
	public String toString(){
		
		return this.name + ":" + workers.size() + ":" + projects.size();
	}
	
	

}

import java.util.*;

public class Worker {

	private String nickName;
	private int salary;
	private ArrayList<Project> projects;
	private ArrayList<Qualification> qualifications;
	
	public boolean isOverLoaded() {
		
		
		return false;
	}
	
	public String toString() {
		
		return this.nickName + ":" + projects.size() + ":" + qualifications.size() + ":" + this.salary;
	}
	
	
	
}

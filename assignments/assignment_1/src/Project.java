import java.util.*;

public class Project {
	
	private String name;
	private ProjectSize size;
	private ProjectStatus status;
	private ArrayList<Worker> workers;
	private ArrayList<Qualification> qualifications;
	
	
	public String toString() {
		
		return this.name + ":" + workers.size() + ":" + this.status;
	}
}

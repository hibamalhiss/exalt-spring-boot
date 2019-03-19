package com.example.demo.request;




import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;





@Entity
public class Request {
	
	@Id
	private String id;
	private String comment;
	private String name;
	private String description;
	private int weekNumber;
	private int  priority;
	private boolean  isConsecutive;
	private int shiftsLength;
	private String  type ;
	private boolean isArgent ;
    private String testObjecteves;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name = "request_id") 
    private List<Project> project = new ArrayList<Project>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name = "request_id") 
    private List<Product> product = new ArrayList<Product>();
    
//    private Component[] components;
//    private Press[] presses;
//    private Media[] media;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "hub_id", referencedColumnName = "id")
	private Hub hub;

	
	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Hub getHub() {
		return hub;
	}


	public void setHub(Hub hub) {
		this.hub = hub;
	}


	public Request() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getWeekNumber() {
		return weekNumber;
	}


	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public boolean isConsecutive() {
		return isConsecutive;
	}


	public void setConsecutive(boolean isConsecutive) {
		this.isConsecutive = isConsecutive;
	}


	public int getShiftsLength() {
		return shiftsLength;
	}


	public void setShiftsLength(int shiftsLength) {
		this.shiftsLength = shiftsLength;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isArgent() {
		return isArgent;
	}


	public void setArgent(boolean isArgent) {
		this.isArgent = isArgent;
	}



	public String getTestObjecteves() {
		return testObjecteves;
	}


	public void setTestObjecteves(String testObjecteves) {
		this.testObjecteves = testObjecteves;
	}


	public Request(String id, String comment, String name, String description, int weekNumber, int priority,
			boolean isConsecutive, int shiftsLength, String type, boolean isArgent, String testObjecteves,
			List<Project> project, List<Product> product, Hub hub) {
		super();
		this.id = id;
		this.comment = comment;
		this.name = name;
		this.description = description;
		this.weekNumber = weekNumber;
		this.priority = priority;
		this.isConsecutive = isConsecutive;
		this.shiftsLength = shiftsLength;
		this.type = type;
		this.isArgent = isArgent;
		this.testObjecteves = testObjecteves;
		this.project = project;
		this.product = product;
		this.hub = hub;
	}






	
}

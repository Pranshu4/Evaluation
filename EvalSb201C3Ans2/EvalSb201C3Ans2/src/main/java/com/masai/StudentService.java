package com.masai;

import java.util.List;
import java.util.Map;

public class StudentService {
	
	private Map <Student, Course> theMap ;  // inject 3 entries with valid details
	
	private List<Student> theList;           //inject List of 5 Student object
	private String appName;
	public Map<Student, Course> getTheMap() {
		return theMap;
	}
	public void setTheMap(Map<Student, Course> theMap) {
		this.theMap = theMap;
	}
	public List<Student> getTheList() {
		return theList;
	}
	public void setTheList(List<Student> theList) {
		this.theList = theList;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	
	    public void printMap(){
		//print all the student's and their course details from theMap
	    	
			
			for(Map.Entry<Student ,Course> stuCourse:theMap.entrySet())
			{
				System.out.println(stuCourse.getKey()+ " " +stuCourse.getValue());
			}
		}
		public void printList(){
		//sort the List of Student according to the marks (make use of Lamda
		//expression).
		//print all the sorted Student Details
			
			
		}
		public void printAppName(){
			System.out.println("AppName is :" + appName);
		//print the injected appName
		}

	
	
}

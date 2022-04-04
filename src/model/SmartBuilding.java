package model;

import generics.LinkedList;

public class SmartBuilding{
	private int numberOfFloors; //number of floors of the smart building
	private int numberOfOffices; //number of offices per floor of the smart building
	private LinkedList<Office> offices;

	public SmartBuilding(int numberOfFloors, int numberOfOffices){
		this.numberOfFloors = numberOfFloors;
		this.numberOfOffices = numberOfOffices;
		this.offices = new LinkedList<>();
		initializeOffices();
	}
	
	/**
	 * This method initializes the offices
	 */
	public void initializeOffices() {
		int n = numberOfFloors * numberOfOffices;
		int c = numberOfFloors;
		for(int i = 0; i<n; i++) {
			if(i%numberOfFloors == 0 && i!=0) {
				c--;
			}
			offices.add(new Office(i+1,c));	
		}
	}

}
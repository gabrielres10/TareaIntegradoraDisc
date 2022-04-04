package model;
import generics.LinkedList;

public class BuildingSystem{
	private int numberOfBuildings; //Number of smart buildings
	private LinkedList<SmartBuilding> smartBuildings;

	public BuildingSystem(int numberOfBuildings){
		this.numberOfBuildings = numberOfBuildings;
		smartBuildings = new LinkedList<>();
	}

	public void addSmartBuilding(int floors, int offices){
		smartBuildings.add(new SmartBuilding(floors, offices)); 
	}

	public LinkedList<SmartBuilding> getSmartBuildings (){
		return smartBuildings;
	}

}
package model;

public class Office{
	private int id; //identificator of the office
	private int floor; //floor of the office
	
	public Office(){}
	
	public Office(int id, int floor){this.id = id; this.floor = floor;}
	
	public void setId(int id){
		this.id = id;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public String toString() {
		return "id: " + id + ", floor: " + floor;
	}
}
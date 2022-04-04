package ui;

import java.util.Scanner;
import model.BuildingSystem;

/**
* This is the main class, it allows the user to interact with the program
* @author Gabriel Restrepo, Juan Camilo Gonzalez
*/
public class DiscreetGuys{
	private Scanner sc;
	private BuildingSystem myBuilding;

	/**
	* Constructor method of the class DataCenter
	*/
	public DiscreetGuys(){
		sc = new Scanner(System.in);
	}

	/**
	 * Main method. **Description of the program**
	 * @param args The command line arguments.
	 **/
	public static void main(String[] args) {
		DiscreetGuys dg = new DiscreetGuys();

		System.out.println("Starting app...");
		int N = dg.askForNumberOfBuildings();

		for(int i = 0; i<N; i++){
			dg.newBuilding();
		}
		
	}

	/**
	* Asks the user for the number of buildings initializes the BuildingSystem with the number of buildings
	*/
	public int askForNumberOfBuildings(){
		int N = sc.nextInt();
		myBuilding =  new BuildingSystem(N);
		return N;
	}

	/**
	* Asks the user for the information of a building
	*/
	public void newBuilding(){
		String id; //This is the id of the buiding
		int P; //This is the number of persons in the building
		int F; //This is the number of floors of the building
		int O; //This is the number of offices of the building

		id = sc.next();
		P = sc.nextInt();
		F = sc.nextInt();
		O = sc.nextInt();
		sc.nextLine();
		myBuilding.addSmartBuilding(F,O);
		for(int i = 0; i<P; i++){
			myBuilding.getSmartBuildings().getFirstElement();
		}

	}

	/**
	* Asks the user for the information of a person
	*/
	public void newPerson(){
		String name = sc.next();
		int b = sc.nextInt();
		int e = sc.nextInt();
		sc.nextLine();
	}

	


}

public class Car extends Vehicle {
	
	private int numberOfDoors;
	
	public Car(int vehicleID, String vehicleReg, int numberOfDoors) {
		super(vehicleID, vehicleReg);
		this.numberOfDoors = numberOfDoors;
			
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}

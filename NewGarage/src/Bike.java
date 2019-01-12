
public class Bike extends Vehicle {
	
	private int size;
	
	public Bike(int vehicleID, String vehicleReg, int size) {
		super(vehicleID, vehicleReg);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

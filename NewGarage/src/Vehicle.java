
public abstract class Vehicle {
	
	private int vehicleID;
	private String vehicleReg;
	
	public Vehicle(int vehicleID, String vehicleReg){
		//super();
		this.vehicleID = vehicleID;
		this.vehicleReg = vehicleReg;
		
	}
	

	
	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleReg() {
		return vehicleReg;
	}

	public void setVehicleReg(String vehicleReg) {
		this.vehicleReg = vehicleReg;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", vehicleReg=" + vehicleReg + "]";
	}


}


public class Van extends Vehicle {
	
	private int storageSpace;
	
	public Van (int vehicleID, String vehicleReg, int storageSpace) {
		super(vehicleID, vehicleReg);
		this.storageSpace = storageSpace;
		
	}
	

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
}

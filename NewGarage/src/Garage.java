import java.util.ArrayList;

import java.util.stream.Collectors;

public class Garage {
		
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public ArrayList<Vehicle> getVehicleList(){
		return vehicleList;
	}
	

	public void removeVehiclebyID(int vehicleID) {
		vehicleList.removeAll(vehicleList.stream().filter(v -> v.getVehicleID() == (vehicleID)).collect(Collectors.toList()));
	}
	
	public void removeVehiclebyReg(String vehicleReg) {
		vehicleList.removeAll(vehicleList.stream().filter(v -> v.getVehicleReg().equals(vehicleReg)).collect(Collectors.toList()));
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void calculateCost(Vehicle vehicle) {
		int cost = 0;
		if(vehicle instanceof Car) {
			cost = 50;
		}
		if(vehicle instanceof Van) {
			cost = 70;
		}
		if(vehicle instanceof Bike) {
			cost = 40;
		}
		
		System.out.println("Cost of repair: " +cost);
	}
	
	public void removeAllVehicles() {
		vehicleList.removeAll(vehicleList);
	}
}

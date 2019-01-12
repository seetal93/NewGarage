
public class Runner {

	public static void main(String[] args) {
		
		Vehicle c = new Car(555, "BR4567", 3); //No of doors is 3/5
		Vehicle b = new Bike(556, "BT5678", 10);  // size is 10/15
		Vehicle v = new Van(557, "BT6789", 10);  // storage space is 5/10
		
		Garage g = new Garage();
		
		
		//g.removeVehiclebyID(555);
		//g.removeVehiclebyReg("BT5678");
		
		g.addVehicle(c);
		g.addVehicle(b);
		g.addVehicle(v);
		
		//g.calculateCost(c);
		//g.calculateCost(b);
		//g.calculateCost(v);
		
		//g.removeAllVehicles();
		
		for(Vehicle vehicle : g.getVehicleList()) {
			System.out.println(vehicle);
			//System.out.println(g.calculateCost(vehicle));
		}
		
		
	}

}

package taxidatastore;

import java.util.ArrayList;
import java.util.List;

//import ezycabservice.Booking;
//import ezycabservice.Cab;

public class vehicleDataStore {
	
	public static ArrayList<taxi_vehicle> vcl= new ArrayList<taxi_vehicle>();
	
	 //ArrayList<taxi_vehicle> vcl= new ArrayList<taxi_vehicle>();
	 
		taxi_vehicle v1 = new taxi_vehicle(1, 1, "Audi", 1, 1, 10, 20, 6);
		taxi_vehicle v2 = new taxi_vehicle(2, 2, "Toyota", 2, 2, 20, 40, 60);
		taxi_vehicle v3 = new taxi_vehicle(3, 3, "Suzuki", 3, 3, 40, 60, 100);
		taxi_vehicle v4 = new taxi_vehicle(4, 4, "Audi", 3, 3, 40, 60, 100);
		taxi_vehicle v5 = new taxi_vehicle(5, 5, "Honda", 3, 3, 40, 60, 100);

		
		
	public ArrayList addDatatoVehicle()
	{
	  // ArrayList<taxi_vehicle> vcl= new ArrayList<taxi_vehicle>();
	    /*
	    java.util.Iterator<taxi_vehicle> itr = vcl.iterator();
	    
		
		taxi_vehicle v1 = new taxi_vehicle(1, 1, "Brand1", 1, 1, 10, 20, 6);
		taxi_vehicle v2 = new taxi_vehicle(2, 2, "Brand1 2", 2, 2, 20, 40, 60);
		taxi_vehicle v3 = new taxi_vehicle(3, 3, "Brand3", 3, 3, 40, 60, 100);
		taxi_vehicle v4 = new taxi_vehicle(4, 4, "Brand4", 3, 3, 40, 60, 100);
		taxi_vehicle v5 = new taxi_vehicle(5, 5, "Brand1 5", 3, 3, 40, 60, 100);
		*/
		vcl.add(v1);
		vcl.add(v2);
		vcl.add(v3);
		vcl.add(v4);
		vcl.add(v5);
			
		return vcl;
	}
}

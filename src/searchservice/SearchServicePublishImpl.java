package searchservice;

import java.util.*;
import searchservice.*;
import taxidatastore.*;

public class SearchServicePublishImpl implements SearchServicePublish {

	public String checkCabAvailability() {

		System.out.println("----- Display All the Available Vehicle Details ---- ");
		System.out.println("VehicleCode | VehicleBrand | VehicleType | VehicleCondition | ChargePerKM | ExtraChargePerKM");
		
		vehicleDataStore vehicles = new vehicleDataStore();
		//vehicles.addDatatoVehicle();

		Iterator<taxi_vehicle> itr = vehicles.vcl.iterator();

		while (itr.hasNext()) {
			taxi_vehicle st = (taxi_vehicle) itr.next();
			System.out.println(st.vId + " " + st.vCode + " " + st.vBrand + " " + st.vType + " " + st.vCondition + " "
					+ st.v_charge_per_KM + " " + st.v_extra_charge_per_KM + " " + st.vQuantity);
		}

		return "All Available Cab Details Displayed Successfully !";

	}

	public String searchSpecificCab() {
		
		System.out.println("----- Search if Specific Vehicle Brand Available ---- ");

		
		//String brand = String.valueOf(st4.vBrand);
		
		vehicleDataStore vehicles = new vehicleDataStore();
		

		Iterator<taxi_vehicle> itr = vehicles.vcl.iterator();

		int count=0;
		
		System.out.println("Please Enter a Vehicle Brand Name :");
		Scanner in = new Scanner(System.in);
		String keyWord = in.next();

		if (in.equals(" ")) {
			System.out.println("Please Enter a Brand Name to proceed with the search:");
		} else {
			
			//for (vehicleDataStore c : vcl) {
			while (itr.hasNext()) {
				taxi_vehicle st4 = (taxi_vehicle) itr.next();
				if (st4.vBrand.contains(keyWord)) {
					//System.out.println(st4.vBrand);
					count++;
				}
			}
			System.out.println(count+" vehciles are available with the specific Brand");
		}

		return "Specific Search Results Displayed According to the Requested Brand";
	}

}

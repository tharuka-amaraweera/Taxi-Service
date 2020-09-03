package PaymentService;

import taxidatastore.bookingDataStore;
import taxidatastore.taxi_vehicle;
import taxidatastore.vehicleDataStore;

import java.util.*;

public class pubserviceImpl implements pubservice {
	
	public int getTotalCharge()
	{
		int bid=0;
		int distance=0;
		int vid=0;
		int vehicalId=0;
		int charge=0;
		int totalcharge=0;
		
		bookingDataStore book = new bookingDataStore();
		//book.addBooking();
		int booking [] = book.getLastBooking();
		bid=booking[0];
		distance=booking[1];
		vid=booking[2];
//		System.out.println("booking is : "+bid);
//		System.out.println("distance is : "+distance);
//		System.out.println("vehicle id : "+ vid);
		
		vehicleDataStore vds =new vehicleDataStore();
		ArrayList<taxi_vehicle> vls = vds.addDatatoVehicle();
		
		java.util.Iterator<taxi_vehicle>itr = vls.iterator();
		while(itr.hasNext()) {
			taxi_vehicle st = (taxi_vehicle) itr.next();
			vehicalId=st.vId;
			charge=(int) st.v_charge_per_KM;
			if(vehicalId==vid)
			{
				totalcharge=charge*distance;
			}
			}
		System.out.println("Charge per KM "+charge);
		System.out.println("total is : ");
		return totalcharge;
		
	}
}

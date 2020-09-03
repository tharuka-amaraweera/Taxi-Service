package taxidatastore;

import java.util.*;

public class bookingDataStore {
	
	public static ArrayList<taxi_booking> bl= new ArrayList<taxi_booking>(); //not static older
	 taxi_booking b1 = new taxi_booking(10001, 1, 1, "Malabe", "Kandy", 10, 3, 60, 45, "18/03/2019", "20/03/2019", 3, 4);
	 taxi_booking b2 = new taxi_booking(10002, 1, 1, "Kandy", "Colombo", 10, 3, 60, 45, "18/03/2019", "20/03/2019", 3, 4);
	 taxi_booking b3 = new taxi_booking(10003, 1, 1, "Gampaha", "Mathale", 10, 3, 60, 45, "18/03/2019", "20/03/2019", 3, 4);
	 taxi_booking b4 = new taxi_booking(10004, 1, 1, "Colombo", "Anuradhapura", 10, 3, 60, 45, "18/03/2019", "20/03/2019", 3, 4);
	 taxi_booking b5 = new taxi_booking(10005, 1, 1, "Jaffna", "Katharagama", 10, 3, 60, 45, "18/03/2019", "20/03/2019", 3, 4);
	 
	 public ArrayList<taxi_booking> getList(){
	        return bl;
	    }
	
	 public String addBooking() {
		 bl.add(b1);
		 bl.add(b2);
		 bl.add(b3);
		 bl.add(b4);
		 bl.add(b5);
		 return "Bookings are added";
	 }
	 
	 public static int[] getLastBooking()
		{
			int [] arr=new int [3];
			int vhid=0;
			int distance=0;
			int bid=0;
			
		   java.util.Iterator<taxi_booking>itr=bl.iterator();
			  while(itr.hasNext())
			  {
				  taxi_booking ins=(taxi_booking)itr.next();
				  vhid=ins.ref_vId;
				  distance=(int) ins.noOfKM;
				  bid=ins.bookId;
				  
			  }
			  arr[0]=bid;
			  arr[1]=distance;
			  arr[2]=vhid;
			  
			return arr;
		}
	 
	 
	
}

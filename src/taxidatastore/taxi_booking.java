package taxidatastore;

public class taxi_booking {
	public int bookId;
	public int ref_vId;
	public int ref_uId;
	public String startLocation;
	public String destin_location;
	public double noOfKM;
	public double noOfExtraKM;
	public double charge;
	public double extraCharge;
	public String bookDate;
	public String releaseDate;
	public double duration;
	public int quantity;
	
	public taxi_booking(int bookId,int ref_vId,int ref_uId,String startLocation,String destin_location,double noOfKM,double noOfExtraKM,double charge,double extraCharge,String bookDate,String releaseDate,double duration,int quantity){
		this.bookId=bookId;
		this.ref_vId=ref_vId;
		this.ref_uId=ref_uId;
		this.startLocation=startLocation;
		this.destin_location=destin_location;
		this.noOfKM=noOfKM;
		this.noOfExtraKM=noOfExtraKM;
		this.charge=charge;
		this.extraCharge=extraCharge;
		this.bookDate=bookDate;
		this.releaseDate=releaseDate;
		this.duration=duration;
		this.quantity=quantity;
	}
}

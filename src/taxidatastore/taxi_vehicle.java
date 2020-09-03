package taxidatastore;

public class taxi_vehicle {
	public int vId;
	public int vCode;
	public String vBrand;
	public int vType;
	public int vCondition;
	public double v_charge_per_KM;
	public double v_extra_charge_per_KM;
	public int vQuantity;
	
	public taxi_vehicle(int vId,int vCode,String vBrand,int vType,int vCondition,double v_charge_per_KM,double v_extra_charge_per_KM,int vQuantity){
		this.vId=vId;
		this.vCode=vCode;
		this.vBrand=vBrand;
		this.vType=vType;
		this.vCondition=vCondition;
		this.v_charge_per_KM=v_charge_per_KM;
		this.v_extra_charge_per_KM=v_extra_charge_per_KM;
		this.vQuantity=vQuantity;
	}
}

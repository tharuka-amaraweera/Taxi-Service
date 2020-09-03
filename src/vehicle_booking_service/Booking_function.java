package vehicle_booking_service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Booking_function implements Booking_interface {

	
	
	private int quntity;
    private String type;
    private String desination;
    private String Starting_point;
    private int distance;
    private String Phone_num;
    Scanner keyword = null;
	
	
	@Override
	public void setQuntity() {
	
		Scanner sc1 = new Scanner(System.in);
		int hh=sc1.nextInt();
		
		 //valdation quntit
		if(hh<0)
            {
                System.out.println("Please enter valide quntity between 1 and 64 ");
                setQuntity();   
            }
            else if(hh>64)            {
               System.out.println("Please enter valide quntity between 1 and 64 ");
                setQuntity();
            }
            else{
                  this.quntity=hh;
                  System.out.println("-------------------------------------------------");
            }

		
		
		
	}

	@Override
	public void settype() {
		//String ty= keyword.next();
		Scanner sc1 = new Scanner(System.in);
		int hh=sc1.nextInt();
	
		//validation 
	
		if(hh==1) {
			System.out.println("a/c");
			this.type="A/C";
			
		}else if(hh==2)
		{
			System.out.println(" non a/c");
			this.type="Non A/C";
		}
		else {
			System.out.println("Please enter Valid Number");
			settype();
		}
		
	
		
	}

	@Override
	public void setstart() {
		Scanner sc1 = new Scanner(System.in);
		String startigpoint=sc1.next();
		
		
		
		
	}

	@Override
	public void setdstination() {
	
		Scanner sc1 = new Scanner(System.in);
		String destinationpoint=sc1.next();
		
		
	}

	@Override
	public void setphone() {
	
		Scanner sc1 = new Scanner(System.in);
		String phone=sc1.next();
		
		//validating
		
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(phone);
		
		if(matcher.matches()) {
			
			System.out.println("Thank you");
			
		}else {
			System.out.println
			("Invalid phone number !!!");
			setphone();
		}

		
	}

}

class HotelBooking{ 
    private String guestName; 
    private String roomType; 
    private double nights; 

   public HotelBooking() 
    { 
        guestName="Vikas Sahu"; 
         roomType="AC"; 
         nights=30; 
    } 

   public HotelBooking(String guestName,String roomType,double nights) 
    { 
        this.guestName=guestName; 
        this.roomType=roomType; 
        this.nights=nights; 

    }

   public HotelBooking(HotelBooking obj) 
    { 
        guestName=obj.guestName; 
        roomType=obj.roomType; 
        nights=obj.nights;
    }  


    public void details() 
    { 
        System.out.println("guestName is = "+ guestName+" room type is = "+roomType+" for total nights "+ nights); 
    }
}
public class HotelDetails {
    public static void main(String[] args) {
        HotelBooking h=new HotelBooking(); 
        h.details();
         
        HotelBooking h1=new HotelBooking("Shivam", "deluxe", 34); 
        h1.details(); 

        HotelBooking h2=new HotelBooking(h1); 
        h2.details(); 

    }
}

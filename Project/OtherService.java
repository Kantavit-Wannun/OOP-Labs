public class OtherService extends Service {
    private String serviceType;

    public OtherService(String date,String barber,int quantity,double price,String serviceType){
        super(date, barber, quantity, price);
        this.serviceType = serviceType;
    }

    public String getServiceType(){
        return serviceType;
    }
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    @Override 
    public String getDescription(){
        return serviceType;
    }
}
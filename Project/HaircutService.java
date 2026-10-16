public class HaircutService extends Service{
    private String haircutType;

    public HaircutService(String date,String barber,int quantity,double price,String haircutType){
        super(date, barber, quantity, price);
        this.haircutType = haircutType;
    }

    public String getHaircutType(){
        return haircutType;
    }
    public void setHaircutType(String haircutType){
        this.haircutType = haircutType;
    }

    @Override
    public String getDescription() {
        return "Haircut (" +haircutType+ ")";
    }
}
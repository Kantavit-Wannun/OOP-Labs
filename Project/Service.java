public abstract class Service implements ServiceRecord{
    private String date;
    private String barber;
    private int quantity;
    private double price;

    public Service(String date,String barber,int quantity,double price){
        this.date = date;
        this.barber = barber;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getBarber(){
        return barber;
    }
    public void setBarber(String barber){
        this.barber = barber;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public final double calculateTotal(){
        return quantity * price;
    }
    public abstract String getDescription();
}
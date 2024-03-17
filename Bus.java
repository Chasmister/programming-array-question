


public class Bus
{
    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;
    
    public Bus(String numberPlate, String color, String route, String customerName, Boolean availableStatus, int rate)
    {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }
    
    public String getNumberPlate()
    {
        return this.numberPlate;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public String getRoute()
    {
        return this.route;
    }
    
    public String getCustomerName()
    {
        return this.customerName;
    }
    
    public boolean getAvailableStatus()
    {
        return this.availableStatus;
    }
    
    public int getRate()
    {
        return this.rate;
    }
    
}

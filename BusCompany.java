
import java.util.ArrayList;
import java.util.Iterator;
public class BusCompany
{
    private ArrayList<Bus> busList;
    
    public BusCompany()
    {
        busList = new ArrayList<Bus>();
    }
    
    public void addBus(Bus bus)
    {
        busList.add(bus);
    }
    
    public void removeBus(Bus bus)
    {
        Iterator<Bus> itr = busList.iterator();
        
        boolean removed = false;
        while(itr.hasNext()) 
        {
            if (itr.next() == bus)
            {
                itr.remove();
                removed = true;
                System.out.println("Object has been removed");
            }
        }
        if (removed == false)
        {
            System.out.println("Error, Object not found");
        }
    }
    
    public void displayInfo()
    {
        for(Bus bus : busList)
        {
            System.out.println(bus.getNumberPlate());
            System.out.println(bus.getColor());
            System.out.println(bus.getRoute());
            System.out.println(bus.getCustomerName());
            System.out.println(bus.getAvailableStatus());
            System.out.println(bus.getRate());
            System.out.println("");
        }
    }
    
    public void expensive()
    {
        for(Bus bus : busList)
        {
            if(bus.getRate() > 500)
            {
                System.out.println(bus.getNumberPlate());
                System.out.println(bus.getColor());
                System.out.println(bus.getRoute());
                System.out.println(bus.getCustomerName());
                System.out.println(bus.getAvailableStatus());
                System.out.println(bus.getRate());
                System.out.println("");
            }
        }
    }
    
    public void colored()
    {
        for(Bus bus : busList)
        {
            if(bus.getColor() == "Red" || bus.getColor() == "Blue")
            {
                System.out.println(bus.getNumberPlate());
                System.out.println(bus.getColor());
                System.out.println(bus.getRoute());
                System.out.println(bus.getCustomerName());
                System.out.println(bus.getAvailableStatus());
                System.out.println(bus.getRate());
                System.out.println("");
            }
        }
    }
    
    
}

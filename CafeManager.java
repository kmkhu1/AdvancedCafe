import java.util.ArrayList;
import java.io.*;

public class CafeManager implements Serializable
{
    private ArrayList <MenuItem> menuOffers;
    private ArrayList <Order> customerOrders;
    
    public CafeManager()
    {
        menuOffers = new ArrayList<MenuItem>();
        customerOrders = new ArrayList<Order>();
        setDefaultMenu();
    }
    
    public void showCafeInterface()                                                     //displays the interface for the menu
    {
        System.out.println("Choose by entering corrisponding number");
        System.out.println("-------Cafe Options-------");
        System.out.println("1 - View menu items");
        System.out.println("2 - Add to menu items");
        System.out.println("3 - Add a new customer order");
        System.out.println("4 - View customer order");
        System.out.println("5 - Close an order");
        System.out.println("6 - Staff training");
        System.out.println("7 - Exit");
        System.out.println("--------------------------");
    }
    
    public ArrayList getMenuOffers()                                                    //returns a duplicate of the menuOffers Array
    {
        ArrayList <MenuItem> duplicate = new ArrayList <MenuItem>();
        for(MenuItem i:menuOffers)
        {
            MenuItem copy = new MenuItem(i.getName(),i.getDiscription(),i.getPrice(),i.getPreperationMethod());
            //copy = i;
            duplicate.add(copy);
        }
        return duplicate;
    }
    
    public ArrayList getCustomerOrders()                                                //returns a duplicate of the customer orders array
    {
        ArrayList <Order> duplicate = new ArrayList <Order>();
        for(Order i:customerOrders)
        {
            Order copy = new Order(i.getOrderNumber(),i.getTableNo(),i.getOrders(),i.getTotalCost());
            //copy = i;
            duplicate.add(copy);
        }
        return duplicate;
    }
    
    public void addToMenu(MenuItem mo)                                                  //adds a menu item to the menu offers array, essentially upating the menu
    {
        MenuItem duplicate = new MenuItem(mo.getName(),mo.getDiscription(),mo.getPrice(),mo.getPreperationMethod());
        //duplicate = mo;
        menuOffers.add(duplicate);
        System.out.println(duplicate.getName() + " has been added to the menu");
    } 
    
    public void updateOrders(Order co)
    {
        Order duplicate = new Order(co.getOrderNumber(),co.getTableNo(),co.getOrders(),co.getTotalCost());
        //duplicate = co;
        customerOrders.add(duplicate);
        duplicate.setOrderNumber(customerOrders.indexOf(duplicate));                             //setting the order number based on its location in the array in the cafe manager class
        System.out.println("Order " + duplicate.getOrderNumber() + " has been placed");
    }
    
    public void setDefaultMenu()                                                        //displays all currently available items on the menu
    {
   
        menuOffers.add(new FoodItem("Beef","Meat of cow",30,"Braai Meat","salt","pepper","spice","lemon","herbs"));
        menuOffers.add(new DrinkItem("Juice","Mix of flavours",20,"Mix and serve",20,30,33,10));
            
    }
    
    public Order getSingleOrder(int i) throws IndexOutOfBoundsException
    {
        Order duplicate = new Order(customerOrders.get(i).getOrderNumber(),customerOrders.get(i).getTableNo(),customerOrders.get(i).getOrders(),customerOrders.get(i).getTotalCost());
        //duplicate = customerOrders.get(i);
        return duplicate;
    }
    
    public MenuItem getSingleItem(int i) throws IndexOutOfBoundsException
    {
        MenuItem duplicate = new MenuItem(menuOffers.get(i).getName(),menuOffers.get(i).getDiscription(),menuOffers.get(i).getPrice(),menuOffers.get(i).getPreperationMethod());
        //duplicate = menuOffers.get(i);
        return duplicate;
    }
}
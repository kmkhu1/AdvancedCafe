import java.util.ArrayList;
import java.io.*;
public class Order implements Serializable
{
    //private static int orderNumberTracker = 0;
    private int orderNumber;
    private String tableNo;
    private double totalCost;
    private boolean open;
    ArrayList <MenuItem> orders;
    
    public Order()
    {
        
        orderNumber = 0;
        open = true;
        tableNo = "";
        orders = new ArrayList<MenuItem>();
        totalCost = 0;
    }
    
    public Order(int on, String tn)
    {
       
        orderNumber = on;
        open = true;
        tableNo = tn;
        orders = new ArrayList<MenuItem>();
        totalCost = 0;
    }
    
    public Order(int on, String tn, ArrayList o, double tc)
    {
       
        orderNumber = on;
        open = true;
        tableNo = tn;
        orders = o;
        totalCost = tc;
    }
    
    public void addOrder(MenuItem food)
    { 
        MenuItem duplicate = new MenuItem(food.getName(),food.getDiscription(),food.getPrice(),food.getPreperationMethod());
        //duplicate = food; 
        orders.add(duplicate);
        System.out.println(duplicate.getName() +" has been added to the order");
    }
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public String getTableNo()
    {
        return tableNo;
    }
    
    public double getTotalCost()
    {
        return totalCost;
    }
    
    public void setTableNo(String tn)
    {
        tableNo = tn;
    }
    
    public void setOrderNumber(int on)
    {
        orderNumber = on;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    //you were fixing this method
    public ArrayList getOrders()                                                //returns a duplicate arraylist of all the menu itesm odered
    {
        ArrayList <MenuItem> duplicate = new ArrayList<MenuItem>();
        for(MenuItem i:orders)
        {
            MenuItem copy = new MenuItem(i.getName(), i.getDiscription(), i.getPrice() ,i.getPreperationMethod());
            //copy = i;
            duplicate.add(copy);
        }
        return(duplicate);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void calculateTotalPrice()                                            //calculates the total price of all the menu items by adding all thier prices
    {
        for(MenuItem i:orders)
        {
            totalCost += i.getPrice();
        }
    }
    
    public String showItems()                                                   //shows the details of each order, including all the menuItems i that order
    {
        totalCost = 0;
        String listOfOrders = "";
        for(MenuItem i: orders)
        {
            listOfOrders += i.getName() + ", " + i.getDiscription() + ": " + i.getPrice()+"\n";
        }
        calculateTotalPrice();
        return "orderNumber: " + orderNumber + "\nTable Number: " + tableNo +"\n\nMenu items on this order:\n" + listOfOrders + "\n\nTotal: " + totalCost;
    }
    
    
    public String toString()
    {
        String listOfOrders = "";
        for(MenuItem i: orders)
        {
            listOfOrders = i.getName() + ", " + i.getDiscription() + ": " + i.getPrice()+"\n";
        }
        return "orderNumber: " + orderNumber + "\nTable Number: " + tableNo +"\n\nOrders:\n" + listOfOrders + "\n\nTotal: " + totalCost + "\nOpen?: " + open;
    }
    
    public void closeOrder()                                                    //closes an order by changing boolean variabe
    {
        open = false;
        System.out.println("Order " + this.orderNumber + " closed");
    }
    
    public boolean isOpen()                         
    {
        return open;
    }
}
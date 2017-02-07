import java.io.*;
public class MenuItem implements Serializable
{
    protected String name;
    private String description;
    private double price;
    protected String preperationMethod;
    
    public MenuItem() 
    {
        name = "";
        description = "";
        price = 0;
        preperationMethod = ""; 
    }
    
    public MenuItem(String n, String d, double p, String prep)
    {
        name = n;
        description = d;
        price = p;
        preperationMethod = prep; 
    }
    
    public String toString()            
    {
        return("Name: " + name + "\nDescription: " + this.description + "\nPrice: " + this.price +"\nPreperation method: " + this.preperationMethod + "\n");
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
     public void setDescription(String d)
    {
        description = d;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void setPreperationMethod(String prep)
    {
        preperationMethod = prep;
    }
    
    public String getName()
    {
        return name;
    }
    
     public String getDiscription()
    {
        return description; 
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getPreperationMethod()
    {
        return preperationMethod;
    }
    
    public String getInstructions()
    {
        return ("Name: " + name + "\nPreperation method: " + preperationMethod + "\n");
    }
    /*
    public void addIngredient(String s)
    {
        
    }
    
    public void setPercentageChoc(double p)
    {
       
    }
    
    public void setPercentageCoffee(double p)
    {
       
    }
    
    public void setPercentageTea(double p)
    {
       
    }
    
    public void setPercentageMilk(double p)
    {
       
    }
    */
}
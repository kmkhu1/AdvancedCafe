public class DrinkItem extends MenuItem
{
    private double percentChoc;
    private double percentCoffee;
    private double percentTea;
    private double percentMilk;
    
    public DrinkItem()
    {
        super();
        percentChoc = 0;
        percentCoffee = 0;
        percentTea = 0;
        percentMilk = 0;
    }
    
    public DrinkItem(String n, String d, double p, String prep, double pCh, double pC, double pT, double pM)
    {
        super(n,d,p,prep);
        percentChoc = pCh;
        percentCoffee = pC;
        percentTea = pT;
        percentMilk = pM;
    }
    
    @Override public String getInstructions()
    {
        return ("Name: " + this.name + "\nPercentage chocolate: " + this.percentChoc + "\nPercentage coffee: " + this.percentCoffee + "\nPercentage Tea: " + percentTea + "\nPercentage Milk: " + percentMilk);
    }
    
    public void setPercentageChoc(double p)
    {
        
        percentChoc = p;
    }
    
    public void setPercentageCoffee(double p)
    {
        percentCoffee = p;
    }
    
    public void setPercentageTea(double p)
    {
        percentTea = p;
    }
    
    public void setPercentageMilk(double p)
    {
        percentMilk = p;
    }
    
    public double getPercentageChoc()
    {
        return percentChoc;
    }
    
    public double getPercentageCoffee()
    {
        return percentCoffee;
    }
    
    public double getPercentageTea()
    {
        return percentTea;
    }
    
    public double getPercentageMilk()
    {
        return percentMilk;
    }
}
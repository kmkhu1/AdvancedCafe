public class FoodItem extends MenuItem
{
    private String[] ingredients;
    
    public FoodItem()
    {
        super();
        ingredients = new String[5];
        ingredients[0] = "";
        ingredients[1] = "";
        ingredients[2] = "";
        ingredients[3] = "";
        ingredients[4] = "";
    }
    
    public FoodItem(String n, String d, double p, String prep, String i1,String i2,String i3,String i4,String i5)
    {
        super(n,d,p,prep);
        ingredients = new String[5];
        ingredients[0] = i1;
        ingredients[1] = i2;
        ingredients[2] = i3;
        ingredients[3] = i4;
        ingredients[4] = i5;
    }
    
    @Override public String getInstructions()
    {
        String ing = "";
        for(String i:ingredients)
        {
            if (!(i.equals("")))
            {
                ing += " \t" + i + "\n";
            }
        }
        return ("Name: " + this.name + "\nIngredients\n" + ing + "\nPreperation Method: " + this.preperationMethod);
    }
    
    public void addIngredient(String ing)
    {
        int update = 0;
        for(int i = 0; i < ingredients.length; i++)
        {
            if (ingredients[i].equals(""))
            {
                update = i;
            }
        }
        if (ingredients[update] == "")
        {
            ingredients[update] = ing;
        }
        else
        {
            System.out.println("No more ingredients can be added");
        }
    }
}
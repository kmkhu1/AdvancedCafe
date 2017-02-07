import java.util.InputMismatchException;
import java.io.*;
public class Driver
{
    public static void main(String[] args)
    {
        CafeManager manager = loadCafeManager();
        MenuSystem cafe = new MenuSystem(manager);
        try
        {
            cafe.displayMenu();
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Please eneter only the numbers allowed as indicated by by the menu. Program is now stopped");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please only enter words when appropriate, otherwise only enter numbers. Program is now stopped");
        }
        finally
        {
            save(manager);
        }
    }
    
    private static void save(CafeManager cm)
    {
        FileOutputStream fileOut = null;
        ObjectOutputStream objectOut = null;
        File fileToSave = new File("system.dat");
        try
        {
            fileOut = new FileOutputStream(fileToSave);
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cm);
        }
        catch(FileNotFoundException f)
        {
            f.printStackTrace();
        }
        catch(StreamCorruptedException e)
        {
            e.printStackTrace();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        finally
        {
            try
            {
                if(fileOut != null)
                {
                    fileOut.close();
                }
                if(objectOut != null)
                {
                    objectOut.close();
                }
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
    
    private static CafeManager loadCafeManager()
    {
        File fileToLoad = new File("system.dat");
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        CafeManager loadedManager = new CafeManager();
        try
        {
            if(fileToLoad.canRead() && fileToLoad.isFile())
            {
                fileIn = new FileInputStream(fileToLoad);
                objectIn = new ObjectInputStream(fileIn);
                loadedManager = (CafeManager)objectIn.readObject();
            }            
        }
        catch(FileNotFoundException f)
        {
            f.printStackTrace();
        }
        catch(StreamCorruptedException e)
        {
            e.printStackTrace();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        catch(ClassCastException cce)
        {
            cce.printStackTrace();
        }
        finally
        {
            try
            {
                if(fileIn != null)
                {
                    fileIn.close();
                }
                
                if(objectIn != null)
                {
                    objectIn.close();
                }
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
            finally
            {
                return loadedManager;
            }
        } 
    }
    
}
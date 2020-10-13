/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author velmurugan
 */
public class FoodOrdering
{
    public static void main(String args[])
    {
       ArrayList<String> menu = new ArrayList<String>();
        HotelThread Thread1 = new HotelThread("Thread 1");
        HotelThread Thread2 = new HotelThread("Thread 2");
        Thread1.start();
        try
        {
            Thread1.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println();
        Thread2.start();
        try
        {
            Thread2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Enter The Menu Items,Type F to Finish");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String item = reader.readLine();
            while (!item.equalsIgnoreCase("F"))
            {
                menu.add(item);
                item = reader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.exit(1);
        }
       Customer customer1 = Thread1.GetCustomer();
        Customer customer2 = Thread2.GetCustomer();
        System.out.println("Order For Customer-1");
        for (String food : customer1)
        {
            if (menu.contains(food))
            {
                System.out.println(food + "is Available");
            } else
            {
                System.out.println(food + "is Not Available");
            }
        }
        System.out.println("Order For Customer-2");
        for (String food : customer2)
        {
            if (menu.contains(food))
            {
                System.out.println(food + "is Available");
            } else
            {
                System.out.println(food + "is Not Available");
            }
        }
        System.out.println("Have A Healthy Life,Vist Again");
    }
}
class Customer extends ArrayList<String>
{  
    private String name;
    public Customer()
    {
        super();
    }
    public Customer(Customer obj)
    {
        super(obj);
    }
    public Customer(int size)
    {
        super(size);
    }
    public void SetName(String Name)
    {
        name = Name;
    }
    public String GetName()
    {
        return name;
    }
}
class HotelThread extends Thread
{
    private Customer customer;
    public HotelThread(String ThreadName)
    {
        super(ThreadName);
        customer = new Customer();
    }
    public void run()
    {
        synchronized (customer)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                System.out.println("From, " + super.getName());
                System.out.println("Enter Your Name: ");
                String name = reader.readLine();
                customer.SetName(name);
                System.out.println("Enter The Food Items You Need,Type F to Finish:");
                String food = reader.readLine();
                while (!food.equalsIgnoreCase("F"))
                {
                    customer.add(food);
                    food = reader.readLine();
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
                System.exit(1);
            }
        }
    }
    Customer GetCustomer()
    {
        return customer;
    }
}



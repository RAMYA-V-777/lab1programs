/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class interfacee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurent obj=new Restaurent();
        obj.calculateBill();
        obj.display();
        SuperMarket obj1=new SuperMarket();
        obj1.calculateBill();
        obj1.display();
    }
    
}
interface printable
{
    abstract void calculateBill();
    abstract void display();
}
class Restaurent implements printable
{
    double mealCharge;
		final double tax = 0.0675; 
		double taxAmount;
		double totalWithTax;
		final double tip = 0.20; // 20% constant amount of total amount after adding tax amount
		double tipAmount; 
		double totalBill;
   public void calculateBill()
    {
        
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the charge for your meal:");
		mealCharge = obj.nextDouble();
               //calculate meal charge, tax amount, tip amount, and total bill
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;	
    }
    public void display()
    {
        //display to user meal charge, tax amount, tip amount, and total bill
                System.out.println("*******************************");
                System.out.println("*RESTAURENT BILL DETAILS*");
                 System.out.println("***********************************");
		System.out.println("Meal charge amount is:" + mealCharge);
		System.out.println("Tax amount is:"+taxAmount);
		System.out.println("Tip amount is:"+ tipAmount);
		System.out.println("Total bill amount is:" + totalBill);
                   System.out.println("THANK YOU........VISIT AGAIN.......");
                  System.out.println("*******************************");
                  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}
class SuperMarket implements printable
{
       Scanner obj=new Scanner(System.in);
    int no, i;
   String item[]=new String[20];
    float price[]=new float[20];
    float amount[]=new float[20];
    float taxAmount, tax, totalAmount, taxTotalAmount;
    public void calculateBill(){
          System.out.println("Enter the following details:");
           
            System.out.println("Enter the number of items purchased:");
            no=obj.nextInt();
            for(i=1; i<=no; i++){
                System.out.println("Enter the name of the item:"+i);
                item[i]=obj.next();
            }
            for(i=1; i<=no; i++){
                System.out.println("Enter the Price of the item: "+item[i]);
                price[i]=obj.nextFloat();
            }
        for(i=1; i<=no; i++){
            amount[i]=price[i];
            totalAmount+=amount[i];
        }
        if(totalAmount>3000){
            tax=17.5f;
            taxAmount=(totalAmount*tax/100);
            taxTotalAmount=totalAmount+taxAmount;
        }
        else if(totalAmount>1500&&totalAmount<=3000){
            tax=12.0f;
            taxAmount=(totalAmount*tax/100)+(totalAmount);
            taxTotalAmount=totalAmount+taxAmount;
        }
        else{
            tax=7.0f;
            taxAmount=(totalAmount*tax/100)+(totalAmount);
            taxTotalAmount=totalAmount+taxAmount;
        }
    }
    
    
   public void display(){
       System.out.println("*******************************");
       System.out.println("*SUPERMARKET BILL DETAILS*");
        System.out.println("***********************************");
        System.out.println("Bill amount is:");
        for(i=1; i<=no; i++)
        System.out.println("******Name of the items bought***********:"+item[i]);
        System.out.println("2.Total amount of the items:"+totalAmount);
        System.out.println("3. Tax amount of the items :"+taxAmount);
        System.out.println("4. Total amount of the bought items including tax:"+taxTotalAmount);
         System.out.println("THANK YOU........VISIT AGAIN.......");
           System.out.println("*******************************");
        
        
    }
}
   
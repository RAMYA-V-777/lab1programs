/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           mail obj=new mail();//object creation for class mail
         //invoking objects
         obj=new mail();
         obj.get();
         obj.creation();
         
    }
    
}
class mail
{
    String FirstName;
    String LastName;
    void get()//function to get first and last name
    {
         Scanner obj=new Scanner(System.in);
         System.out.println("***********************");
         System.out.println("Enter The Firstname:");
         FirstName=obj.next();
         System.out.println("***********************");
         System.out.println("Enter The Lasttname:");
         LastName=obj.next();
          
    }
    void creation()//function to create E-Mail Id
    {
        String sub1 = FirstName. substring(0,3); 
        String sub2 = LastName. substring(0,4); 
        System.out.println("***********************");
        System.out.println("The required E-Mail id is:");
        System.out.println(FirstName. substring(0,3)+"."+ LastName. substring(0,4)+".@vcet.ac.in");//using substring()->to consider(extract) first 3 characters from first name and first 4 chracters from last name
        System.out.println("***********************");
     }  
}
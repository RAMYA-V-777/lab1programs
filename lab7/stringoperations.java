/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author velmurugan
 */
public class stringoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        list.add(0,"purple");
        list.add(1,"indigo");
        list.add(2,"blue");
        list.add(3,"pink");
        list.add(4,"red");
        list.add(5,"cap");
        list.add(6,"app");
        list.add(7,"pop"); 
        System.out.println("Contents of the array list: ");
        System.out.println(list);
        //Searching a string in the list by using arraylist
        System.out.println("----------------------");
         System.out.println("Search the element=app");
          System.out.println("----------------------");
         if (list.contains("app"))
         {
             System.out.println("Element Found");
         }  
             //System.out.println("The position of the given string "+element+" is "+list.indexOf(element));
         else
         {
            System.out.println("Element Not Found"); 
         }
    
             
        
      
        
         System.out.println("------------------------------------------------------");
         System.out.println("String that begin and end with the given letter(p):");
           System.out.println("------------------------------------------------------");
     for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
 if (str.endsWith("p")||(str.startsWith("p"))) 
 {
 System.out.println(str);

}
     }
    }
}

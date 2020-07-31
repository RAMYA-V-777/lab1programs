/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class search {
    
    public static void main(String[] arg){
            Scanner obj=new Scanner(System.in);
   
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        System.out.println("Enter the digit:");
        int m=obj.nextInt();
     int position=0;
      while(n>0)
      {
          if(n%10==m)
              System.out.println(position);
          ++ position;
          n/=10;
      }
     
      
      }
       
     
        
    


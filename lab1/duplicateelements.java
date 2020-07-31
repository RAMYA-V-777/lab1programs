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
public class duplicateelements {
    private static int i;
    private static int j;
    public static void main(String[] args){
        Scanner  obj=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int n=obj.nextInt();
          System.out.println("Enter the terms");
         int m[]=new int[n];
         for(i=0;i<n;i++)
         {
             m[i]=obj.nextInt();
            
         }
         for(i=0;i<n-1;)
             for(j=i+1;j<n;)
             {
             if(m[i]==m[j])
                System.out.println("Duplicate elements found");
            else
                System.out.println("Duplicate elements not found");
             i++;
             j++;
             }
    }
         }
         
    
    
}

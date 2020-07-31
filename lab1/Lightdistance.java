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
public class Lightdistance {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter no of days:");
        float days=obj.nextFloat();
       
        float distance;
        
        
        distance= (float) (18.6*1000000*24*60*60*days);
        System.out.println("Distance travelled by the light is:"+distance+"trillion metres");
        
        
    }
    
}

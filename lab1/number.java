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
public class number {
    private static int i;
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int r=0;
        for(i=101;i<200;i++)
        {
            if(i%8==0)
            r=r+i;
        }
        System.out.println("The required number is:"+r);
        
        }
    }
    


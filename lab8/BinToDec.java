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
public class BinToDec
{
public static void main(String[] args) {
Scanner obj= new Scanner(System.in);
System.out.println("**************************************");
System.out.println("Enter the binary string:");
String str = obj.next();//getting a binary string
int n;
int s=0 , r= 0,c=1;
for(int i = 0; i < str.length() ; i++)
{
 if(str.charAt(i) =='1' || str.charAt(i) =='0')
 {
 c=1;
 }
else
 {
 c=0;
 }
}
if(c==0)
 {
    System.out.println("**************************************");
 System.out.println("Invalid Binary String: "+str);
 System.out.println("**************************************");
 }
else if(c==1)
 {
     //procedure to convert binary string to decimal number
 n= Integer.parseInt(str);
 for(int i = 0; i < str.length() ; i++)
 {
 s= n%10;
 n= n/10;
 r= (int) (r+(s*Math.pow(2,i)));
 }
 System.out.println("**************************************");
 System.out.println("The decimal number for "+str+" is:"+r);
 System.out.println("**************************************");
 }
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class FirstPrgrm
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //odd count of integers
           Integer n[]={2,3,4,5,6,7,8,11};
           test3<Integer> ob=new test3<>(n);//obj for accessing class test45
            System.out.println("Count of odd integers in the given Integer Array->");
            ob.count();
        //swaping the position
            //For Integer
            Integer num[]={1,2,3,4,5,6,7};
            test4<Integer> obj=new test4<Integer>();//obj for accessing class test4
            obj.swap(num,2,4);
            System.out.println("Exchanging positions of two diffferent elements in Integer array->"+Arrays.toString(num)); 
             //For Character
            Character c1[]={'p','i','c','k','i','n','g'};
            test4<Character> obj1=new test4<Character>();//obj for accessing class test4
            obj1.swap(c1,0,5);
            System.out.println("Exchanging positions of two diffferent elements in Character array->"+Arrays.toString(c1));
              //For String
            String s[]={"aaa","iii","rrr","ccc","rrr","aaa","fff","ttt"};
            test4<String> obj2=new test4<String>();//obj for accessing class test4
            obj2.swap(s,0,2);
            System.out.println("Exchanging positions of two diffferent elements in String array->"+Arrays.toString(s));
            Double d[]={2.0,4.0,6.0,7.0,9.0,11.0,900.0};
            //For Double
            test4<Double> obj3=new test4<Double>();//obj for accessing class test4
            obj3.swap(d,0,2);
            System.out.println("Exchanging positions of two diffferent elements in Double array->"+Arrays.toString(d));
             Scanner obj4=new Scanner(System.in);
             //maximal element in the range in the array
             System.out.println("\nEnter start value of range");
             int start=obj4.nextInt();
             System.out.println("\nEnter end value of range");
             int finish=obj4.nextInt();
             //For Integer
             System.out.println("The maximal element in the range is->( For Integer Array)->"+ obj.maximalelement(num, start, finish));//obj for accessing class test4
             //For Strng
             System.out.println("The maximal element in the range is->( For String Array)->"+ obj.maximalelement(s, start, finish));//obj for accessing class test4
             //For Double
             System.out.println("The maximal element in the range is->( For Double Array)->"+ obj.maximalelement(d, start, finish));//obj for accessing class test4
             //For Character
             System.out.println("The maximal element in the range is->( For Character Array)->"+ obj.maximalelement(c1, start, finish));//obj for accessing class test4
    }
}
class test3<T extends Number>//class for odd count
{
    T[] value;
    int count=0;

    public test3(T[] value) {
        this.value = value;
    }
 
  public void count()//generic method to count odd integers in an array
    {
      for(int i=0;i<value.length;i++)
      {
          if(((value[i].doubleValue()) % 2) != 0)
          {
             count=count+1;
          }
    }
       System.out.println(count);
}
}



class test4<T extends Comparable>
{
    int temp;
   
    public <T> void swap(T[] a,int i,int j)//generic method to swap the positions of two elements in the array
    {
        
       for(int o=0;o<a.length;o++)
       {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
       }      
}



   
    public <T extends Comparable> T maximalelement(T[] value,int start,int finish)//generic method to find maximal element in the range in the array
{
   T max=value[start];
   int i;
   for(i=start+1;i<finish;i++)
   {
       if(value[i].compareTo(max)>0)
       {
           max=value[i];
       }
       
   }
   return max;
}
}
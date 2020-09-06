/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author velmurugan
 */
public class emplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        emp e1=new emp("Divya",90000);
        emp e2=new emp("Kavya",80000);
        emp e3=new emp("Leena",70000);
        emp e4=new emp("Teena",440000);
        emp e5=new emp("Amulya",590000);
        emp e6=new emp("Riya",30000);
        emp e7=new emp("Shaniya",7865909);
        emp e8=new emp("Meeka",100099);
        emp e9=new emp("Anu",890767);
        emp e10=new emp("Deva",10987);
        emp e11=new emp("Vidya",90800);
        emp e12=new emp("Monicka",89760);
        emp e13=new emp("Sharmi",109877);
        emp e14=new emp("Jasmine",977710);
        emp e15=new emp("Sheela",15670);
        emp e16=new emp("Rithu",14440);
         emp e17=new emp("Meenu",155360);
         emp e18=new emp("Srinila",90870);
        emp e19=new emp("Adiyuthra",674590);
       emp e20=new emp("Varsha",983425);
        ArrayList<emp> list=new  ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);
         list.add(e12);
        list.add(e13);
        list.add(e14);
        list.add(e15);
        list.add(e16);
        list.add(e17);
        list.add(e18);
        list.add(e19);
         list.add(e20);
          Collections.sort(list,new salarysort());
         System.out.println(list);
         
        
    }
    
}
class emp
{
    String name;
    double salary;
    emp(String n,double s)
    {
        name=n;
        salary=s;
    }
     public String toString()
    {
        return "\nName="+name+"\tSalary="+salary;
    }
}
class salarysort implements Comparator<emp>//inbuilt interface for sorting
{
   public int compare(emp e1,emp e2)
   {
       //System.out.println(e1.salary+"..."+e2.salary);
       return(int)(e1.salary-e2.salary);// either +ve or -ve.if =--->no swap,if minus---->swap,,if s1-s2--->print in ascending order,,if s2-s1----->print in descending order
       //s1--->second no,s2--->frst no
   }
}
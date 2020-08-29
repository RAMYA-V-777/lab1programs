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
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /* person obj=new studentt();
        obj.getData();
        obj.display();*/
        studentt obj1=new studentt();
       obj1.getData();
        obj1.display();
        obj1.displaymark();
     /* person obj2=new faculty();
       obj2.getData();
       obj2.display();*/
       faculty obj3=new faculty();
       obj3.getData();
        obj3.display();
       obj3.displaysalarydetails();
    }
}
abstract class person
{
     String name;
    int aadharno;
    abstract void getData();
    abstract void display();
}
class studentt extends person
{
    int m1,m2,m3;
    String status;
    
    
     void getData()
    {
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter the name of the student:");
       name=obj.next();
      System.out.println("Enter the aadharno of the student:");
       aadharno=obj.nextInt();
       System.out.println("Enter m1,m2,m3:");
       m1=obj.nextInt();
       m2=obj.nextInt();
       m3=obj.nextInt();
    }
    void display()
    {
        System.out.println("***********************************");
         System.out.println("The student's details are:");
          System.out.println("***********************************");
         System.out.println("Name:"+name);
         System.out.println("Aadhar Number:"+aadharno);
         
    }
     void displaymark()
    {        
        int ave=((m1+m2+m3)/3);
        if(ave>=80)
           status="First class";
        else if((ave>=70)&&(ave<=79))
            status="second class";
         else if((ave>=50)&&(ave<=69))
               status="third class";
        else
             status="Fail";
        System.out.println("***********************************");
       System.out.println("The student's mark details are:");
        System.out.println("***********************************");
        System.out.println("Computer mark:"+m1);
        System.out.println("Maths mark:"+m2);
        System.out.println("Physics marks:"+m3);
        System.out.println("The average mark of the student:"+(m1+m2+m3)/3);
        System.out.println("The total mark of the student:"+(m1+m2+m3));
        System.out.println("The status of the student:"+status);
         System.out.println("***********************************");
        
    }
    
}
class faculty extends person
{
    int id;
    String dept;
    double salary;
    double da , hra ,pf, gp =0.00, np=0.00;
    void getData()
    {
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter the name of the faculty:");
       name=obj.next();
       System.out.println("Enter the aadharno of the faculty:");
       aadharno=obj.nextInt(); 
       System.out.println("Enter the salary of the faculty:");
       salary=obj.nextDouble(); 
       
    }
    void display()
    {
         System.out.println("***********************************");
        System.out.println("The faculty's details are:");
         System.out.println("***********************************");
         System.out.println("Name:"+name);
         System.out.println("Aadharno:"+aadharno);
    }
   
    public void displaysalarydetails()
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("***********************************");
       System.out.println("Salary detail's of the faculty:");
        System.out.println("***********************************");
         da = 0.30*salary;
        hra=12.5*salary;
        pf=0.10*salary;
        gp = salary+ da+hra;
        np = gp - pf;
        System.out.println(" Name of the faculty :"+name);
        System.out.println("Basic salary : "+salary);
        System.out.println("Gross salary :"+ gp);
        System.out.println(" Net salary "+np);
         System.out.println("***********************************");
    }
 }
    
    

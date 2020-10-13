/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;
import java.util.*;
/**
 *
 * @author velmurugan
 */
public class ThreadsThree{
	public static void main(String args[]) {
		RanNo r1 = new RanNo();
		r1.start();
	}
}

class RanNo extends Thread {
	public void run() {
		Random ran1 = new Random();
		for (int i = 0; i < 10; i++) 
                {
			int ran2= ran1.nextInt(100);
			System.out.println("Random no generated at the moment:" + ran2);
			if((ran2%2) == 0)
                        {
				Sqr s1 = new Sqr(ran2);
				s1.start();
			}
			else 
                        {
				Cube c1= new Cube(ran2);
				c1.start();
			}
			try 
                        {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
                        {
				System.out.println(e);
			}
		}
	}
}

class Sqr extends Thread
{
	int n;
	Sqr(int ran3)
        {
		n=ran3;
	}
	public void run()
        {
		System.out.println("Square of "+n+"="+(n*n));
	}
}

class Cube extends Thread 
{
	int n;
	Cube(int ran3)
        {
		n=ran3;
	}
	public void run() 
        {
		System.out.println("Cube of "+n+"="+n*n*n);
	}
}


 
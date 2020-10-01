/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author velmurugan
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String FileName=obj.next();
        File f=new File(FileName);
        System.out.println("The name of the given file is--->"+FileName.substring(0,FileName.indexOf('.')));
        System.out.println("The type of the given file is--->"+FileName.substring(FileName.indexOf(".") + 1));
        if(f.exists())
        System.out.println("The given file->"+FileName+" exist");
        else
        System.out.println("The given file->"+FileName+" doesnot exists");
        if(f.canRead())
        System.out.println("The given file->"+FileName+" is readable");
        else
        System.out.println("The given file->"+FileName+" is not readable"); 
        if(f.canWrite())
        System.out.println("The given file->"+FileName+" is writable");
        else
        System.out.println("The given file->"+FileName+" is not writable");
        if(f.canExecute())
        System.out.println("The given file->"+FileName+" is executable");
        else
        System.out.println("The given file->"+FileName+" is not executable");
        System.out.println("The length of the given file->"+FileName+" is: "+(byte)f.length());
        }
    }
    


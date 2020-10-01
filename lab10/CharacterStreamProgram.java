/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
//1.BinaryFiles
public class CharacterStreamProgram {//Here the image will not be printed in the output file "ProgramOutput.jpg".

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO code application logic here
        
        FileReader fr=null;
        FileWriter fw=null;
        //Here the binaryfile is audio file of extension .jpg
        fr=new FileReader("ProgramInput.jpg");
        fw=new FileWriter("ProgramOutput.jpg");
        int j;
        while((j=fr.read())!=-1)
            fw.write(j);
        fw.close();
        fr.close();
    }
    
}

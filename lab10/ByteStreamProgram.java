/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
//1.BinaryFiles
public class ByteStreamProgram {//Here the image will be printed in the output file "ProgramOutput.jpg".

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        FileInputStream fio=null;
        FileOutputStream fou=null;
          //Here the binaryfile is audio file of extension .jpg
        fio=new FileInputStream("ProgramInput.jpg");
        fou=new FileOutputStream("ProgramOutput.jpg");
        int i;
        while((i=fio.read())!=-1)
            fou.write(i);
        
        fio.close();
        fou.close();;
    }
}
    
 
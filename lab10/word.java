/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author velmurugan
 */
public class word{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        BufferedReader obj=new BufferedReader(new FileReader("lab10FirstFile.txt"));
        String read;
        int i=1,countWord=0;
        String s[];
        while((read=obj.readLine())!=null)
        {
            s=read.split(" ");
            for(i=0;i<s.length;i++)
            {
                System.out.print("*"+s[i]+"\n");
                if(s[i].length()==3)
                    countWord++;
            }
        }
        System.out.println("No of three letter words in the file is->:"+countWord);
        obj.close();
    }
}
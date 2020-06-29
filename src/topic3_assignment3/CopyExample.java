package topic3_assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyExample {
    public static void main(String args[])
    {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try
        {
            File infile=new File("C:\\MyInputFile.txt");
            File outfile=new File("C:\\MyOutputFile.txt");

            fis=new FileInputStream(infile);
            fos=new FileOutputStream(outfile);
            byte[] buffer=new byte[1024];

            int length;
            while((length=fis.read(buffer))>0)
            {
                fos.write(buffer,0,length);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully.");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

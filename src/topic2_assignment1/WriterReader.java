package topic2_assignment1;

import java.io.*;

public class WriterReader {
    public static <ClassNoFoundException> void main(String args[]) throws IOException {
        Person p1=new Person("Vipin",32,"Male");
        Person p2=new Person("Reena",24,"Female");
        try
        {
            FileOutputStream fos=new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            fos.close();
            FileInputStream fis=new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream ois=new ObjectInputStream(fis);
            Person p3=(Person) ois.readObject();
            Person p4=(Person) ois.readObject();
            System.out.println(p3.toString());
            System.out.println(p4.toString());
            ois.close();
            fis.close();
        }
        catch(FileNotFoundException | ClassNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch(IOException e)
        {
            System.out.println("Error initializing stream");
        }

    }
}

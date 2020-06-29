package assignment1;

public class NoOfObjects {
    static int noOfObjects=0;
    NoOfObjects()
    {
        noOfObjects++;
    }
    public static void main(String args[])
    {
        NoOfObjects obj1=new NoOfObjects();
        NoOfObjects obj2=new NoOfObjects();
        NoOfObjects obj3=new NoOfObjects();
        NoOfObjects obj4=new NoOfObjects();
        System.out.println("Number of objects created: "+noOfObjects);

    }
}

package topic2_assignment2;

import java.util.List;

public class AssignmentTest {
    public static void main(String args[])
    {
        List<Object> list=new MyArrayListProgram<>();
        try
        {
            list.add(99);
            list.add(3.1F);
            list.add(22.2222D);
            list.add("Data");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}

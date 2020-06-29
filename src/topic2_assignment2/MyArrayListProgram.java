package topic2_assignment2;

import java.util.ArrayList;

public class MyArrayListProgram<E> extends ArrayList<E> {
    public boolean add(E e)
    {
        if(e instanceof Integer || e instanceof Float || e instanceof Double)
        {
            super.add(e);
            return true;
        }
        else
        {
            throw new ClassCastException("Only Integer, Float, and Double are supported.");
        }
    }
}


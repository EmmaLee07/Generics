import java.util.*;
public class GenericArrayList<E> implements GenericList<E> 
{
    private List<E> list;
    private E[] test;
    int size;

    public GenericArrayList() 
    {
        list = new ArrayList<E>();
        //tesst = new E[0];
        test = (E[]) new Object[0];
        size = 0;
    }

    /**
     *    Add obj to the end of the list.
     *    This method always returns true
     */
    public boolean add(E obj)
    {
        if(test.length > 0) {
            test[size] = obj; }
        size++; 
        return true;

    }

    /**
     *    Add obj to the specified index of the list.
     *    If index is too big, then add obj to the end of the list
     *    If index is too small, then add obj to the start of the list
     */
    public void add(int index, E obj){
        if(index >= size)
        {
            add(obj); 
        }
        else
        {
            size++;
            if (index < 0){
                index = 0;
            }
            for (int i = size-1; i > index; i--)
            {
                test[i] = test[i-1];
            }
            test[index] = obj;
        }}

    /**
     *    Return true is this list contains something that is .equals() to obj
     */
    public boolean contains(E obj){
        boolean tracker = false;
        for(int i = 0; i < size; i++)
        {
            if(test[i].equals(obj))
            {
                tracker = true;
            }
        }
        return tracker;
    }

    /**
     *    Return the Object located at the specified index
     *    If index is too big or too small, return null
     */
    public E get(int index){
        if(test.length > 0){
            if(outOfBounds(index))
            {
                return null; 
            }
            return test[index];
        }
        else {
            return null;
        }
    }

    /**
     *    Return true if there are no elements in the list
     */
    public boolean isEmpty(){
        if(test.length == 0)
        {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     *    Remove the Object at the specified index from the list
     *    Return the Object that was removed
     *    If index is too big or to small, do not remove anything from the list and return null
     *  If the list is empty, return null
     */
    public E remove(int index){
        E obj = null;
        if(outOfBounds(index))
        {
            return null;
        }
        else
        {
            if(index <= test.length) {
            obj = test[index];
            for(int i = index; i < size-1; i++)
            {
                test[i] = test[i+1];
            }
            size--; }
        }
        return obj;
    }

    /**
     *    Remove the first Object that is .equals() to obj
     *    Return true if an object was removed
     */
    public boolean remove(E obj)
    {
        for(int i = 0; i < size; i++)
        {
            Object cur = test[i];
            if(test[i].equals(obj))
            {
                remove(i);
                i--;
                return true;
            }
        }
        return false;  
    }

    /**
     *    Change the value stored at index to obj
     *    Return the value that was replaced
     *    If index is too big or too smalll, do not change and values and return null
     */
    public E set(int index, E obj)
    {
        E returnValue = null;
        if(index >= 0 && index < size){
            returnValue = test[index];
            test[index] = obj; 
        }
        return returnValue;
    }

    /**
     *    Return the number of elements that are in the list
     */
    public int size()
    {
        return size;
    }

    public boolean outOfBounds(int index) {
        return index < 0 || index >= size;
    }
}


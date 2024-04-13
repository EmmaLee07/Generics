import mayflower.*;
public class MyArrayList implements MyList {
   
    private Object[] data;
    int size;
    
    public MyArrayList() {
        data = new Object[100];
        //data = new Object[1]; //not supposed to be here
    }
    
    public boolean add(Object obj)
    {
        data[size] = obj;
        size++;
        return true;
    }
    
    public void add(int index, Object obj) {
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
                data[i] = data[i-1];
            }
            data[index] = obj;
        }
    }
    
    public boolean contains(Object obj)
    {
        boolean tracker = false;
       for(int i = 0; i < size; i++)
       {
           if(data[i].equals(obj))
           {
               tracker = true;
           }
       }
       return tracker;
    }
    
    public Object get(int index) 
    {
        if(index < 0 || index > size)
        {
            return null; 
        }
        return data[index];
    }
    
    public boolean isEmpty(){
       return size == 0;
    }
    
    public Object remove(int index){
       Object obj = null;
       if(index < 0 || index >= size)
       {
           return null;
       }
       else
       {
           obj = data[index];
           for(int i = index; i < size-1; i++)
           {
                data[i] = data[i+1];
            }
            size--;
        }
       return obj;
    }
    
    public boolean remove(Object obj){
        for(int i = 0; i < size; i++)
        {
            Object cur = data[i];
            if(data[i].equals(obj))
            {
                remove(i);
                i--;
                return true;
            }
        }
        return false;
    }
    
    public Object set(int index, Object obj){
        Object returnValue = null;
        if(index >= 0 && index < size){
            returnValue = data[index];
            data[index] = obj; 
        }
        return returnValue;
    }
    
    public int size(){
        return size;
       }
       
    public boolean outOfBounds(int index) {
        return index < 0 || index >= size;
    }
}


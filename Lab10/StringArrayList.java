public class StringArrayList extends MyArrayList implements StringList
{
    /**
     *	If obj is *not* an instanceof a String then this method should
     *	NOT add obj to the list and it should return false.
     *	Otherwise, it should do whatever MyArrayList does for this method.
     */
    public boolean add(Object obj)
    {

        if(obj instanceof String)
        {
            String str = (String) obj;
            //Do whatever MyArrayList does for this method
            return super.add(obj);
        }
        else {
            return false;
        }
    }

    /**
     *	If obj is *not* an instanceof a String then this method should
     *	NOT add obj to the list and it should return false.
     *	Otherwise, it should do whatever MyArrayList does for this method.
     */
    public void add(int index, Object obj)
    {
        if(obj instanceof String)
        {
            String str = (String) obj;
            //Do whatever MyArrayList does for this method
            super.add(index, obj);
        }
    }

    /**
     *	If obj is *not* an instanceof a String then this method should
     *	NOT set the value at index to obj and it should reutnr null.
     *	Otherwise, it should do whatever MyArrayList does for this method
     */
    public Object set(int index, Object obj)
    {
        Object returned = null;
        if(obj instanceof String)
        {
            String str = (String) obj;
            //Do  whatever MyArrayList does for this method
            return super.set(index, obj);
        }
        else {
            returned = null;
            return null;
        }
    }

    public String getStr(int index)
    {
        if(outOfBounds(index))
        {
            return null;
        }
        else {
            return (String) get(index);
        }
    }

    public String removeStr(int index)
    {
        if(outOfBounds(index))
        {
            return null;
        }
        else {
            return (String) remove(index);
        }
    }

    public String setStr(int index, String str)
    {
       if(outOfBounds(index))
       {
           return null;
       }
       else 
       {
           return (String) set(index, (Object) str);
       }
    }
    
}


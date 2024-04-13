public class IntegerArrayList extends MyArrayList implements IntegerList 
{
    /**
     *	Return the Integer located at the specified index of the list
     *	Return null if the index is out of bounds.
     */
    public Integer getInt(int index) {
        if(outOfBounds(index))
        {
            return null;
        }
        else 
        {
            return (Integer) get(index);
        }
    }

    /**
     *	Remove the Integer located at the specified index and return it
     *	Return null if the index is out of bounds
     */
    public Integer removeInt(int index) {
        if(outOfBounds(index))
        {
            return null;
        }
        else 
        {
            return (Integer) remove(index);
        }
    }

    /**
     *	Set the value at the specified index to the specified str
     *	Return the Integer that was replaced.
     *	Return null if the index is out of bounds.
     */
    public Integer setInt(int index, Integer str){
        if(outOfBounds(index))
        {
            return null;
        }
        else 
        {
            return (Integer) set(index, (Object)str);
        }
    }
}

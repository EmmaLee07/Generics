public class Lab10Part1
{
	public static void main(String[] args)
	{
		MyList list = new MyArrayList();
		list.add(new Integer(7));
		Object x = list.get(0);
		String s = (String)x;
		int length = s.length();
	}
}

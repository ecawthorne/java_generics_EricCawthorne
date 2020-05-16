package csci3444.generics;

public class MyRegularClass
{
	public static<T extends Number> T getSum(T inp1, T inp2)
	{
		if(inp1.getClass() == Integer.class)
		{
			return (T) new Integer(inp1.intValue() + inp2.intValue());
		}
		if(inp1.getClass() == Float.class)
		{
			return (T) new Float(inp1.floatValue() + inp2.floatValue());
		}
		return null;
	}
}

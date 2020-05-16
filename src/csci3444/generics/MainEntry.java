package csci3444.generics;

public class MainEntry
{

	public static void main(String[] args)
	{
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer, Integer> mgi2;
		mgi1 = new MyGenClass<Integer, String>(1, "Eric");
		mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		System.out.println("mgi1 key: " + mgi1.getKey());
		System.out.println("mgi1 value: " + mgi1.getValue());
		System.out.println("mgi2 key: " + mgi2.getKey());
		System.out.println("mgi2 value: " + mgi2.getValue());
		System.out.println("i1 = " + i1);
		System.out.println("f1 = " + f1);
	}

}

package csci3444.generics;

public class MyGenClass<K, V> implements MyGenInterface<K,V>
{
	private K key;
	private V value;

	public MyGenClass(K _key, V _value) {
		this.key = _key;
		this.value = _value;
	}

	public K getKey()
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
}

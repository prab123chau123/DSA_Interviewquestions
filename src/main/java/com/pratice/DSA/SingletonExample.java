package com.pratice.DSA;

public class SingletonExample {
	
	private static SingletonExample singletonExample;
	
	private SingletonExample()
	{
		
	}
	
	//Lazy 
	public static SingletonExample getSingleInstance()
	{
		if(singletonExample==null)
		{
			singletonExample=new SingletonExample();
		}
		return singletonExample;
	}
	
	public void getData()
	{
		System.out.println("This is Singleton class");
	}

}

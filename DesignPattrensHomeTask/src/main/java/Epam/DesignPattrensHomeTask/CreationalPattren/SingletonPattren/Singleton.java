package Epam.DesignPattrensHomeTask.CreationalPattren.SingletonPattren;
class Singleton {
	static Singleton objectForSingletonClass=null;
	private Singleton()
	{
		
	}
	public static Singleton getObjectForSingletonClass()
	{
		if(objectForSingletonClass==null)
		{
			objectForSingletonClass=new Singleton();
			System.out.println("object created");
			return objectForSingletonClass;
		}
		else
		{
			return objectForSingletonClass;
		}
	}

}

package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren.DecoratorPattren;

public class NonVegPizza extends Pizza {
	@Override
	double getPizzaCost()
	{
		return 120.0;
	}
	@Override
	String getDiscription()
	{
		return Pizza.discription+"NonVegPizza ";
	}
}

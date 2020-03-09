package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren.DecoratorPattren;

public class VegPizza extends Pizza {
	@Override
	double getPizzaCost()
	{
		return 100.0;
	}
	@Override
	String getDiscription()
	{
		return Pizza.discription+"VegPizza ";
	}
}

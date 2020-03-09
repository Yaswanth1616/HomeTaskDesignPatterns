package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren.DecoratorPattren;

public class Mushrooms extends ToppingsDecorator{
	Pizza pizzaObject;
	public Mushrooms(Pizza pizza)
	{
		this.pizzaObject=pizza;
	}
	@Override
	double getPizzaCost() {
		return 50.0+pizzaObject.getPizzaCost();
	}
	@Override
	String getDiscription() {
		return pizzaObject.getDiscription()+" with  Mushrooms";
	}
}

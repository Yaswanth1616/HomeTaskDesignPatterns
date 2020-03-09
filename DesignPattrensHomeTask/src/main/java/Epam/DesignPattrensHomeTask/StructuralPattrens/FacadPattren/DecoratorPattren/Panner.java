package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren.DecoratorPattren;

public class Panner extends ToppingsDecorator {
	Pizza pizzaObject;
	public Panner(Pizza pizza)
	{
		this.pizzaObject=pizza;
	}
	@Override
	double getPizzaCost() {
		return 40.0+pizzaObject.getPizzaCost();
	}
	@Override
	String getDiscription() {
		return pizzaObject.getDiscription()+" with Panner ";
	}
}

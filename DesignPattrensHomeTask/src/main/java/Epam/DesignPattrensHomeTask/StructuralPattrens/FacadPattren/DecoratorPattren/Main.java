package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren.DecoratorPattren;

public class Main {

	public static void main(String[] args) {
		Pizza vegPizza=new VegPizza();
		ToppingsDecorator mushroomsDecorator=new Mushrooms(vegPizza);
		System.out.println(mushroomsDecorator.getDiscription()+" cost = "+mushroomsDecorator.getPizzaCost());
		Pizza NonVegPizza=new NonVegPizza();
		ToppingsDecorator pannerDecorator=new Panner(NonVegPizza);
		System.out.println(pannerDecorator.getDiscription()+" cost = "+pannerDecorator.getPizzaCost());
	}

}

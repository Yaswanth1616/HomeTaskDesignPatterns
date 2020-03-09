package Epam.DesignPattrensHomeTask.BehaviourPattren.ObservorPattren;

public class Main {
	public static void main(String[] args)
	{
	Euro euro=new Euro();
	Dollar dollar=new Dollar();
	CurrencyConverter object1=new CurrencyConverter(euro,dollar);
	object1.ChangeCurrency((float)120.0);
	}
}

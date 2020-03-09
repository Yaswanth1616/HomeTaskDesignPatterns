package Epam.DesignPattrensHomeTask.BehaviourPattren.ObservorPattren;

public class CurrencyConverter {
	float rupee;
    Euro euro;
    Dollar dollar;
    public CurrencyConverter(Euro euro,Dollar dollar)
    {
        this.euro=euro;
        this.dollar=dollar;
    }
    public void ChangeCurrency(float d)
    {
    	this.rupee=d;
        euro.update(d);
        dollar.update(d);
    }

}

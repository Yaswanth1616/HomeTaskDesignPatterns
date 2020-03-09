package Epam.DesignPattrensHomeTask.BehaviourPattren.ObservorPattren;

public class Dollar {
	float dollars;
	float rupee;
    public void update(float rupee)
    {
    	this.rupee=rupee;
        dollars=rupee/(float) 69.79;
        display();
    }
    public void display()
    {
        System.out.println("The value of "+rupee+" int Dollar is "+dollars);
    }
}

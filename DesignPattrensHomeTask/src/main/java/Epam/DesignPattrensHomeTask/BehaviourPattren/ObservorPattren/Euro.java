package Epam.DesignPattrensHomeTask.BehaviourPattren.ObservorPattren;

public class Euro {
	float euros;
	float rupee;
    public void update(float rupee)
    {
    	this.rupee=rupee;
        euros=rupee/(float) 78.40;
        display();
    }
    public void display()
    {
        System.out.println("The value of "+rupee+" Euro is "+euros);
    }
}

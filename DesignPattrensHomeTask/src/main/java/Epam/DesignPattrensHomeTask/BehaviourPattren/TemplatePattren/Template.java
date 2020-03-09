package Epam.DesignPattrensHomeTask.BehaviourPattren.TemplatePattren;
abstract class Template {
	 public abstract void rankRequired();
	 public abstract void fee();
	 public final void Hostal()
	 {
	    System.out.println("hostal fee : 100000 per annum");
	 }
	 public void CheckDetails(boolean hostal)
	  {
	     rankRequired();
	     fee();
	     if(hostal)
	      {
	          Hostal();
	       }
	   }
}

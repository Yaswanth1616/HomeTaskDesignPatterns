package Epam.DesignPattrensHomeTask.CreationalPattern.FactoryPattren;

public class Main {

	public static void main(String[] args) {
		FactoryDesignPattren FactoryObject=new FactoryDesignPattren();
		Shape shapeObject=FactoryObject.getShape("Circle");
		Shape shapeObject1=FactoryObject.getShape("Rectangle");
		shapeObject.draw();
		shapeObject1.draw();
	}

}

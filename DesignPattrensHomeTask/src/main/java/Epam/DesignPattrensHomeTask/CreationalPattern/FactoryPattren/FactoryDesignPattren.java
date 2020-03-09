package Epam.DesignPattrensHomeTask.CreationalPattern.FactoryPattren;
class FactoryDesignPattren {
	Shape getShape(String shape)
	{
		if(shape=="Circle")
			return new Circle();
		if(shape=="Rectangle")
			return new Rectangle();
		return null;
	}
}

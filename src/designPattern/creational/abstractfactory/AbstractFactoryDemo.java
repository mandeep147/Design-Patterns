package designPattern.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		shapeFactory.getShape("circle").draw();
		shapeFactory.getShape("rectangle").draw();
		shapeFactory.getShape("square").draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		colorFactory.getColor("red").fill();
		colorFactory.getColor("green").fill();
		colorFactory.getColor("blue").fill();
	}

}
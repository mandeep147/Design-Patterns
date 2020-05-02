package designPattern.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(rectangle);
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		System.out.println("Normal border");
		rectangle.draw();
		System.out.println("\nRectangle with red border: ");
		redRectangle.draw();
		
		System.out.println("\nCircle with red border: ");
		redCircle.draw();
	}

}
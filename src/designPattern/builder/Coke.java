package designPattern.builder;

public class Coke extends ColdDrink {

	   @Override
	   public float price() {
	      return 20.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
}
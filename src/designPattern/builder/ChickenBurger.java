package designPattern.builder;

public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
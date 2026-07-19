abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
class Expresso extends Beverage {
	public Expresso() {
		description = "Expresso";
	}
	public double cost() {
		return 1.99;
	}
}
class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	public double cost() {
		return 0.89;
	}
}
class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}
	public double cost() {
		return 0.20 + beverage.cost();
	}
}

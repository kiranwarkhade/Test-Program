package design_pattern;

public class SmallOnionPizza extends VegPizza {

	@Override
	public String name() {
		
		return "Onion Pizza";
	}

	@Override
	public String size() {
		
		return "Small Size";
	}

	@Override
	public float price() {
		
		return 120.0f;
	}

}

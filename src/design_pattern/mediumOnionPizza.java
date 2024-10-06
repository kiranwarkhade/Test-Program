package design_pattern;

public class mediumOnionPizza extends VegPizza {

	@Override
	public String name() {
		
		return "Onion Pizza";
	}

	@Override
	public String size() {
		
		return "Medium Size";
	}

	@Override
	public float price() {
		
		return 150.0f;
	}

}

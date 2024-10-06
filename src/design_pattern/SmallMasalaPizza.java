package design_pattern;

public class SmallMasalaPizza extends VegPizza {

	@Override
	public String name() {
		
		return "Masala Pizza";
	}

	@Override
	public String size() {
		
		return "Small Size";
	}

	@Override
	public float price() {
		
		return 100.0f;
	}

}

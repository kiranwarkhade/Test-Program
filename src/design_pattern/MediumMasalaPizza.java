package design_pattern;

public class MediumMasalaPizza extends VegPizza {

	@Override
	public String name() {
		
		return "Masala Pizza";
	}

	@Override
	public String size() {
		
		return "Medium Size";
	}

	@Override
	public float price() {
		
		return 120.0f;
	}

}

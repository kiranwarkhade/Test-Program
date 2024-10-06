package design_pattern;

public class SmallCheezePizza extends VegPizza {

	@Override
	public String name() {

		return "Cheeze Pizza";
	}

	@Override
	public String size() {

		return "Small Size";
	}

	@Override
	public float price() {

		return 170.0f;
	}

}

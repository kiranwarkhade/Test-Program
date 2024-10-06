package design_pattern;

public class SmallCoke extends Coke {

	@Override
	public String name() {
		
		return "300 ml Pepsi";
	}

	@Override
	public String size() {
		
		return "small Size";
	}

	@Override
	public float price() {
		
		return 25.0f;
	}
}


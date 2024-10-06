package design_pattern;

public class SmallJira extends Jira {

	@Override
	public String name() {
		
		return " 300 ml jira";
	}

	@Override
	public String size() {
		
		return "small size";
	}

	@Override
	public float price() {
		
		return 30.0f;
	}

}

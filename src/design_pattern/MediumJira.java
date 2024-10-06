package design_pattern;

public class MediumJira extends Jira{

	@Override
	public String name() {
		
		return "500 ml jira";
	}

	@Override
	public String size() {
		
		return "Medium size";
	}

	@Override
	public float price() {
		
		return 50.0f;
	}

}

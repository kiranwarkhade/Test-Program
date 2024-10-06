package design_pattern;

public abstract class Pizza implements Item{


	@Override
	public abstract String name();

	@Override
	public abstract String size() ;

	@Override
	public abstract float price() ;
		

}

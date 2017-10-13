package trees;

public class DouglasFir implements Tree{
	@Override
	public double getCost()
	{
		return 15;
	}
	
	@Override
	public String getDecorations() {
		return "Douglas Fir Tree decorated with ";
	}


}

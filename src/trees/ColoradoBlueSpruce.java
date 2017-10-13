package trees;

public class ColoradoBlueSpruce implements Tree{



	@Override
	public double getCost() {
		return 20;
	}

	@Override
	public String getDecorations() {
		return "Colorado Blue Spruce Tree decorated with ";
	}
}

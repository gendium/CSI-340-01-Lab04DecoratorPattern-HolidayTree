package decorations;

import trees.Tree;

public class Leds extends Decoration {
	public Leds(Tree tree)
	{
		super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 10;
	}
	public String getDecorations()
	{
		return super.getDecorations() + ", LED's";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

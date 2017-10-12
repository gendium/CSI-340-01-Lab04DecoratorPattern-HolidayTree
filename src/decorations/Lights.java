package decorations;

import trees.Tree;

public class Lights extends Decoration{
	public Lights(Tree tree)
	{
	super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 5;
	}
	public String getDecorations()
	{
		return super.getDecorations() + ", Lights";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

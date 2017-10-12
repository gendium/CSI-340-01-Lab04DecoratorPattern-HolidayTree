package decorations;

import trees.Tree;

public class Ruffles extends Decoration{
	public Ruffles(Tree tree)
	{
		super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 1;
	}
	public String getDecorations()
	{
		return super.getDecorations() + ", Ruffles";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

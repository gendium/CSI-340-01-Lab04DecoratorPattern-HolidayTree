package decorations;

import trees.Tree;

public class BallsSilver extends Decoration{
	public BallsSilver(Tree tree)
	{
		super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 3;
	}
	public String getDecorations()
	{
		return super.getDecorations() + ", Balls Silver";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

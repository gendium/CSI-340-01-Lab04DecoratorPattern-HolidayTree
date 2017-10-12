package decorations;

import trees.Tree;

public class BallsRed extends Decoration{
	public BallsRed(Tree tree)
	{
		super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 1;
	}
	
	public String getDecorations()
	{
		return super.getDecorations() + ", Balls Red";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

package decorations;

import trees.Tree;

public class BallsBlue extends Decoration{
	public BallsBlue(Tree tree)
	{
		super(tree);
	}	
	public double getCost()
	{
		return super.getCost() + 2;
	}
	
	public String getDecorations()
	{
		return super.getDecorations() + ", Balls Blue";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

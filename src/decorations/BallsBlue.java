package decorations;

import trees.Tree;

public class BallsBlue extends Decoration{
	public BallsBlue(Tree tree)
	{
		this.decoratedTree = tree;
	}

	public double getCost()
	{
		return decoratedTree.getCost() + 2;
	}
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", Balls Blue";
	}
}

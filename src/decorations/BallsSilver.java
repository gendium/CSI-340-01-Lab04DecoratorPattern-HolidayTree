package decorations;

import trees.Tree;

public class BallsSilver extends Decoration{
	public BallsSilver(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 3;
	}
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", Balls Silver";
	}

}

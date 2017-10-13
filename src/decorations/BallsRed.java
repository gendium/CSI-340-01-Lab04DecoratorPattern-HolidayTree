package decorations;

import trees.Tree;

public class BallsRed extends Decoration{
	public BallsRed(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 1;
	}
	
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", Balls Red";
	}
}

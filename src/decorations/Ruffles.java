package decorations;

import trees.Tree;

public class Ruffles extends Decoration{
	public Ruffles(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 1;
	}
	public String getDecorations()
	{
			return decoratedTree.getDecorations() + ", Ruffles";
	}
}

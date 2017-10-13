package decorations;

import trees.Tree;

public class Lights extends Decoration{
	public Lights(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 5;
	}
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", Lights";
	}
}

package decorations;

import trees.Tree;

public class Ribbons extends Decoration{

	public Ribbons(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 2;
	}
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", Ribbons";
	}

}

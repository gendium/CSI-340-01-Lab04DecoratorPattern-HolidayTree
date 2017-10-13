package decorations;

import trees.Tree;

public class Leds extends Decoration {
	public Leds(Tree tree)
	{
		this.decoratedTree = tree;
	}
	public double getCost()
	{
		return decoratedTree.getCost() + 10;
	}
	public String getDecorations()
	{
		return decoratedTree.getDecorations() + ", LED's";
	}
}

package decorations;

import trees.Tree;

public abstract class Decoration implements Tree {
protected Tree decoratedTree;
public Decoration(Tree tree)
{
	this.decoratedTree = tree;
}
public double getCost()
{
	return decoratedTree.getCost();
}

public String getDecorations()
{
	return decoratedTree.getDecorations();
}


}

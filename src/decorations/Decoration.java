package decorations;

import trees.Tree;

public abstract class Decoration implements Tree {
	protected Tree decoratedTree;

	public abstract double getCost();
	public abstract String getDecorations();

}

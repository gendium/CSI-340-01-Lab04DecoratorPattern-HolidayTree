package decorations;

import trees.Tree;

public class Star extends Decoration{

	boolean isDuplicate;

	public Star(Tree tree)
	{
		this.decoratedTree = tree;
		isDuplicate = false;
		if(tree.getDecorations().contains("Star")) {
			System.out.println("Tree already has Star!");
			isDuplicate = true;

		}
	}
	public double getCost()
	{
		if (isDuplicate)
			return decoratedTree.getCost();
		return decoratedTree.getCost() + 4;
	}
	
	public String getDecorations()
	{
		if (isDuplicate)
			return decoratedTree.getDecorations();
		return decoratedTree.getDecorations() + ", Star";
	}
	
}

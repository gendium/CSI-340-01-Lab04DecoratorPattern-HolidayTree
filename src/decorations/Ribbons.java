package decorations;

import trees.Tree;

public class Ribbons extends Decoration{

	public Ribbons(Tree tree)
	{
		super(tree);
	}
	public double getcost()
	{
		return super.getCost() + 2;
	}
	public String getDecorations()
	{
		return super.getDecorations() + ", Ribbons";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
}

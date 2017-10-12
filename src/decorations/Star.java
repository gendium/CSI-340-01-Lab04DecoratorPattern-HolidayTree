package decorations;

import trees.Tree;

public class Star extends Decoration{
	public Star(Tree tree)
	{
//		if(tree.getDecorations().contains("Star"))
//			{
//				System.out.println("Tree already has a star");
//				return;
//			}
		
		super(tree);
	}
	public double getCost()
	{
		return super.getCost() + 4;
	}
	
	public String getDecorations()
	{
		return super.getDecorations() + ", Star";
	}
	@Override
	public Boolean hasStar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
